package com.mjt.controller;

import com.github.pagehelper.Page;
import com.mjt.common.JsonResult;
import com.mjt.entity.Car;
import com.mjt.entity.City;
import com.mjt.entity.Order;
import com.mjt.entity.User;
import com.mjt.service.InserOrderService;
import com.mjt.utils.StrUtils;
import com.mjt.vo.OrderVo;
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
 * time:2020/09/19  12:56
 * desription:中间表控制层
 */
@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    private InserOrderService inserOrderService;
    //添加订单功能
    @RequestMapping("/insertCar.do")
    @ResponseBody
    public JsonResult insertCar(Integer id,Double oprice,HttpSession session){
        //从共享域回去当前用户的uid
        User user = (User) session.getAttribute(StrUtils.USER_LOGIN);
        //从共享域获取地址
        Integer[] cityids = (Integer[]) session.getAttribute(StrUtils.CITY_IDS);
        //车辆状态
        String status = "已归还11";
        //获取用户id
        Integer uid = user.getId();
        //获取取车地址id
        Integer getid = cityids[1];
        //获取还车地址id
        Integer backid = cityids[3];
        inserOrderService.insert(id,uid,getid,backid,oprice,status);
        return new JsonResult(1,"提交成功");
    }

    //查询所有订单列表
    @RequestMapping("/findAll.do")
    @ResponseBody
    public Map findAll(Integer page,Integer limit,HttpSession session){
        User user = (User) session.getAttribute(StrUtils.USER_LOGIN);
        Integer uid = user.getId();
        List<OrderVo> all = inserOrderService.findAll(uid,page,limit);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        long total = ((Page) all).getTotal();
        map.put("count",total);
        map.put("data",all);
        return map;
    }
    //删除订单
    @RequestMapping("/deleteOrder.do")
    @ResponseBody
    public JsonResult deleteOrder(Integer id){
        inserOrderService.deleteOrder(id);
        return new JsonResult(1,"删除成功");
    }
}