package com.mjt.dao;

import com.mjt.entity.Car;

import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/18  14:45
 * description:选车功能
 */
public interface AllCarDao {
    //选车列表展示
    public List<Car> showCar();
    //填写核对订单
    public Car findCarByid(Integer id);
}
