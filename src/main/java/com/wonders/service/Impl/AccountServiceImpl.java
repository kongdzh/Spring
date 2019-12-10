package com.wonders.service.Impl;

import com.wonders.dao.Impl.AccountDaoImpl;
import com.wonders.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements IAccountService {

//    private final AccountDaoImpl accountDao;
//
//    @Autowired
//    public AccountServiceImpl(AccountDaoImpl accountDao) {
//        this.accountDao = accountDao;
//    }

    @Resource(name = "accountDao")
    private AccountDaoImpl accountDao;

    @Override
    public void saveAccount() {
        accountDao.save();
    }
}
