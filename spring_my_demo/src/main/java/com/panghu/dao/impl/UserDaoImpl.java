package com.panghu.dao.impl;

import com.panghu.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("UserDao 被创建");
    }

    @Override
    public void add() {
        System.out.println("User...Dao" + username + password);
    }
}
