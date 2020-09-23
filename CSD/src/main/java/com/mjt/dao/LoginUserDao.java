package com.mjt.dao;

import com.mjt.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/17  14:10
 * description:用户登录的功能
 */
public interface LoginUserDao {
    //用户注册
    public Integer addUser(User user);
    //登录功能
    //@Param("tel")和@Param("password") 是sql用map传多个参数，注解里面的参数是sql#{}里面的值
    public User findAllLogin(@Param("tel") String tel, @Param("password") String password);
    //修改个人信息
    public void updateUser(@Param("newtel") String newtel,@Param("newemail") String newemail,@Param("tel")String tel);
}
