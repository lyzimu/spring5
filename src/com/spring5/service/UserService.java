package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("this is userService");
        userDao.update();

//        普通方式创建对象及调用方法
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }
}
