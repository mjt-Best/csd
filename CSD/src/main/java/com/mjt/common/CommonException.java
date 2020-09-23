package com.mjt.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Iterator;

/**
 * projectName: day_04_mavenMybatisLogin
 *
 * @author: 马江涛
 * time:2020/09/11  0:52
 * desription:异常验证处理类
 */

//这个类是处理全局异常处理的类
    @ControllerAdvice//控制器的一个增强
    @ResponseBody
public class CommonException {
    @ExceptionHandler(ConstraintViolationException.class)//修饰一个方法表示的是一个异常处理的方法
//返回一个json数据{code：0，info："账户不能为空"}
    public JsonResult constraintViolationException(ConstraintViolationException ex){
        //验证不通过信息
        Iterator<ConstraintViolation<?>> iterator = ex.getConstraintViolations().iterator();
        String message = null;
        if (iterator.hasNext()) {
            message = iterator.next().getMessage();
            System.out.println("message = " + message);
        }


        return new JsonResult(0,message);

    }

//    //处理没有遇到的异常
    @ExceptionHandler
    public JsonResult commonException(Exception ex){
        return new JsonResult(0,ex.getMessage());
    }
}