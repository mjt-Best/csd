package com.mjt.service;

import com.mjt.entity.Order;
import com.mjt.vo.OrderVo;

import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/19  14:13
 * description:提交订单功能
 */
public interface InserOrderService {
    //提交订单功能
    public void insert(Integer cid,Integer uid,Integer getid,Integer backid,Double oprice, String status);
    //查询所有订单
    public List<OrderVo> findAll(Integer uid,Integer page, Integer limit);
    //删除订单
    public void deleteOrder(Integer id);

}
