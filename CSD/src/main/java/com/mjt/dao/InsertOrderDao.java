package com.mjt.dao;

import com.mjt.entity.Order;
import com.mjt.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/19  13:57
 * description:提交订单
 */
public interface InsertOrderDao {
    //提交订单功能
    public void insertOrder(@Param("cid") Integer cid,@Param("uid")
            Integer uid,@Param("getid") Integer getid,@Param("backid") Integer backid,
            @Param("oprice") Double oprice,@Param("status") String status);
    //查询所有订单
    public List<OrderVo> findAll(Integer uid);
    //删除订单
    public void deleteOrder(Integer id);
}
