package com.wonders.dao.Impl;

import com.wonders.dao.IAccountDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void save() {
        System.out.println("保存用户账号");
    }
}
