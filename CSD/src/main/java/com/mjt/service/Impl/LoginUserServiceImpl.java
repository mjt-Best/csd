package com.mjt.service.Impl;

import com.mjt.dao.LoginUserDao;
import com.mjt.entity.User;
import com.mjt.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  14:28
 * desription:登录业务逻辑
 */
@Service
public class LoginUserServiceImpl implements LoginUserService {
    @Autowired
    private LoginUserDao loginUserDao;
    //用户注册
    @Override
    public Integer addUser(User user) {
        Integer row = loginUserDao.addUser(user);
        return row;
    }

    //登录功能的业务逻辑
    @Override
    public User findAllLogin(String tel, String password) {
        User user = loginUserDao.findAllLogin(tel, password);
        System.out.println("service中的user"+user);
        return user;
    }
    //修改个人信息
    @Override
    public void update(String newtel, String newemail, String tel) {
        loginUserDao.updateUser(newtel,newemail,tel);
    }
}