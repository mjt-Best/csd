package com.mjt.controller;

import com.mjt.common.JsonResult;
import com.mjt.entity.User;
import com.mjt.service.LoginUserService;
import com.mjt.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  14:39
 * desription:用户登录控制层
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginUserService loginUserService;
    //用户注册功能
    @ResponseBody
    @RequestMapping("/register.do")
    //从前端获取到的参数可以直接赋值给实体类User user，参数name和实体类属性一致即可
    public JsonResult register(User user){
        Integer row = loginUserService.addUser(user);
        System.out.println("11111111111111111111111111111111111注册是否成功："+row);
        return new JsonResult(1,"注册成功");
    }
    //登录功能
    @ResponseBody
    @RequestMapping("/login.do")
    public JsonResult userLogin(String tel, String password, HttpSession session){
        User user = loginUserService.findAllLogin(tel, password);
        session.setAttribute("user",user);
        System.out.println("controller中的user"+user);
        return new JsonResult(1,user);
    }
    //主页显示账号
    @ResponseBody
    @RequestMapping("/showAccount.do")
    public JsonResult indexshow(HttpSession session){
        User user = (User) session.getAttribute(StrUtils.USER_LOGIN);
        return new JsonResult(1,user.getTel());
    }
    //个人信息显示电话email
    @ResponseBody
    @RequestMapping("/showtel.do")
    public JsonResult show(HttpSession session){
        User user = (User) session.getAttribute(StrUtils.USER_LOGIN);
        return new JsonResult(1,user);
    }
    //修改个人信息
    @ResponseBody
    @RequestMapping("/update.do")
    public JsonResult update(String newtel,String newemail,HttpSession session){
        System.out.println("111111111111111"+newtel);
        User user = (User) session.getAttribute(StrUtils.USER_LOGIN);
        String tel = user.getTel();
        loginUserService.update(newtel,newemail,tel);
        return new JsonResult(1,"修改成功");
    }
}