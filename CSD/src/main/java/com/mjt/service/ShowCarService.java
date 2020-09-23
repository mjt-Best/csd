package com.mjt.service;

import com.mjt.entity.Car;


import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/18  14:54
 * description:展示所有车辆
 */
public interface ShowCarService {
    //展示所有车辆
    public List<Car> showCar(Integer page,Integer limit);
    //填写核对订单
    public Car findCarByid(Integer id);
}
