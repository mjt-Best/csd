package com.mjt.controller;

import com.github.pagehelper.Page;
import com.mjt.common.JsonResult;
import com.mjt.entity.Car;
import com.mjt.service.ShowCarService;
import com.mjt.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/18  14:57
 * desription:显示所有汽车列表
 */
@RequestMapping("/car")
@Controller
public class ShowCarController {
    @Autowired
    private ShowCarService showCarService;
    //显示所有车辆列表
    @RequestMapping("/showAll.do")
    @ResponseBody
    public Map showAll(Integer page,Integer limit){
        List<Car> cars = showCarService.showCar(page,limit);
        //拿到总条数给Page对象
        long rows = ((Page) cars).getTotal();
        //分页返回给后端的格式
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",rows);
        map.put("data",cars);
        return map;
    }
    //填写核对订单
    @RequestMapping("/findCar.do")
    @ResponseBody
    public JsonResult findCarById(Integer id, HttpSession session){
        Car carByid = showCarService.findCarByid(id);
        session.setAttribute(StrUtils.CAR,carByid);
        return new JsonResult(1,carByid);
    }
}