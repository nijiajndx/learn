package dao;

import model.Limb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by sfit0450 on 2014/11/12.
 */
@Repository
public class JdbcSpitterDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Limb limb){
        String insertSql = "insert into limbs values(?,?,?);";
        jdbcTemplate.update(insertSql,limb.getThing(),limb.getLegs(),limb.getArms());
        System.out.println();
    }


}
