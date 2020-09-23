package com.mjt.controller;

import com.mjt.common.JsonResult;
import com.mjt.entity.City;
import com.mjt.service.FindCityService;
import com.mjt.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  22:36
 * desription:查询城市
 */

@Controller
@RequestMapping("/city")
public class FindCityController {
    @Autowired
    private FindCityService findCityService;
    //查询城市功能
    @ResponseBody
    @RequestMapping("/find.do")
    public JsonResult findAllCity(Integer pid, HttpSession session){
        List<City> allCity = findCityService.findAllCity(pid);
        return new JsonResult(1,allCity);
    }
    //获取选车地址和还车地址
    @ResponseBody
    @RequestMapping("/address.do")
    public JsonResult carAddress(Integer quiz1,Integer quiz2,Integer quiz3,Integer quiz4,HttpSession session){
        //把地址县区id存放到session中
        Integer[] cityIds = {quiz1,quiz2,quiz3,quiz4};
        session.setAttribute(StrUtils.CITY_IDS,cityIds);
        String[] address = findCityService.findCityById(quiz1, quiz2, quiz3, quiz4);
        session.setAttribute(StrUtils.CAR_ADDRESS,address);
        return new JsonResult(1,"地址选择成功");
    }
    //选车页面的显示地址
    @ResponseBody
    @RequestMapping("/showAddress.do")
    public JsonResult shortsortAddress(HttpSession session){
        String[] address = (String[]) session.getAttribute(StrUtils.CAR_ADDRESS);

        return new JsonResult(1,address);
    }
}