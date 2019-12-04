package com.wonders.service.Impl;

import com.wonders.dao.Impl.AccountDaoImpl;
import com.wonders.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private AccountDaoImpl accountDao = new AccountDaoImpl();

    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
