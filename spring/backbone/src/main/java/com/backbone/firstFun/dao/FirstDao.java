package com.backbone.firstFun.dao;

import com.backbone.firstFun.module.AccountInfo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sfit0450 on 2014/11/17.
 */
@Repository
public class FirstDao {
    @PersistenceContext
    private EntityManager em;

    public AccountInfo save(AccountInfo accountInfo){
        em.persist(accountInfo);
        return accountInfo;
    }
}
