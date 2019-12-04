package com.wonders.dao.Impl;

import com.wonders.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存用户账号");
    }
}
