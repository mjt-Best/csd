package com.mjt.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mjt.dao.InsertOrderDao;
import com.mjt.entity.Order;
import com.mjt.service.InserOrderService;
import com.mjt.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/19  14:17
 * desription:提交订单业务
 */
@Service
public class InsertOrderServiceImpl implements InserOrderService {
    @Autowired
    private InsertOrderDao insertOrderDao;
    //提交订单功能
    @Override
    public void insert(Integer cid, Integer uid, Integer getid, Integer backid, Double oprice, String status) {
        insertOrderDao.insertOrder(cid, uid, getid, backid, oprice, status);
    }
    //查询所有订单功能
    @Override
    public List<OrderVo> findAll(Integer uid,Integer page, Integer limit) {
        //设置分页紧跟查询语句
        PageHelper.startPage(page, limit);
        List<OrderVo> orderAll = insertOrderDao.findAll(uid);
        return orderAll;
    }

    @Override
    public void deleteOrder(Integer id) {
        insertOrderDao.deleteOrder(id);
    }
}