package com.wonders.service.Impl;

import com.wonders.dao.Impl.AccountDaoImpl;
import com.wonders.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDaoImpl accountDao;

    @Override
    public void saveAccount() {
        accountDao.save();
    }
}
