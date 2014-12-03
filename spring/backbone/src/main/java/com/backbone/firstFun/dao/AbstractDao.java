package com.backbone.firstFun.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDao implements InitializingBean,ApplicationContextAware {
    private ApplicationContext context;
    private JdbcTemplate jdbcTemplate;

    public <T> void findById(Class<T> entityClass, Object entityId){
    }

    public abstract Class getEntityClass();

    @Override
    public void afterPropertiesSet() throws Exception {
            this.jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }
}
