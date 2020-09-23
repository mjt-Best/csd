package com.mjt.interceptor;

import com.mjt.entity.User;
import com.mjt.utils.StrUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * projectName: day_04_mavenMybatisLogin
 *
 * @author: 马江涛
 * time:2020/09/11  10:45
 * desription:登录拦截器
 */
public class LoginIntercreptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //uri统一资源标识符
        //url统一资源定位符
        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        User user = (User) request.getSession().getAttribute(StrUtils.USER_LOGIN);
        if (user == null) {//证明没有登录
            //非ajax请求没有登录直接跳转login页面
            //ajax也跳跳转到login页面
            //如果是jquery的ajax请求，浏览器会有一个特殊请求头
            String value = request.getHeader("X-Requested-With");
            if (value != null && value.equals("XMLHttpRequest")) {//说明是ajax请求
                response.getWriter().print("{\"coed\":0, \"info\":\"未登录\"}");
            }else{
                response.sendRedirect(request.getContextPath()+"/login.html");
            }
            //拦截登录
            return false;
        }
        //不拦截
        return true;
    }
}