package com.backbone.firstFun.service;

import com.backbone.firstFun.dao.FirstDao;
import com.backbone.firstFun.module.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by sfit0450 on 2014/11/17.
 */
@Service
public class FirstService {
    @Autowired
    private FirstDao firstDao;

    public String add(String a,String b){
        return a+b;
    }

    @Transactional
    public AccountInfo saveAccount(AccountInfo accountInfo){
        return firstDao.save(accountInfo);
    }
}
