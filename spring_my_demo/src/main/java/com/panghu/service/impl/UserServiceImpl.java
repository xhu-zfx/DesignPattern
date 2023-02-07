package com.panghu.service.impl;

import com.panghu.dao.UserDao;
import com.panghu.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserService 被创建");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService....");
        userDao.add();
    }
}
