package com.mjt.service;

import com.mjt.entity.User;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  14:20
 * desription:登录功能
 */
public interface LoginUserService {
    //注册功能
    public Integer addUser(User user);
    //登录功能
    public User findAllLogin(String tel, String password);
    //修改个人信息
    public void update(String newtel,String newemail,String tel);
}