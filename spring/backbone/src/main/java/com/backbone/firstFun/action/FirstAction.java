package com.backbone.firstFun.action;

import com.backbone.firstFun.module.AccountInfo;
import com.backbone.firstFun.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sfit0450 on 2014/11/17.
 */
@Controller
public class FirstAction {
    @Autowired
    private FirstService firstService;

    @RequestMapping("/first")
    @ResponseBody
    public AccountInfo fist(AccountInfo accountInfo){
        return firstService.saveAccount(accountInfo);
    }
}
