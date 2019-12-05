package com.wonders.servlet;

import com.wonders.service.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountServlet {

    private final AccountServiceImpl accountService;

    @Autowired
    public AccountServlet(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    public void test() {
        accountService.saveAccount();
        System.out.println("保存账号");
    }
}
