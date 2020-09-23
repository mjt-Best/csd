package com.mjt.service.Impl;

import com.github.pagehelper.PageHelper;
import com.mjt.dao.AllCarDao;
import com.mjt.entity.Car;
import com.mjt.entity.City;
import com.mjt.service.ShowCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/18  14:55
 * desription:展示汽车列表
 */
@Service
public class ShowCarServiceImpl implements ShowCarService {
    @Autowired
    private AllCarDao allCarDao;
    //展示所有汽车列表
    @Override
    public List<Car> showCar(Integer page,Integer limit) {
        //设置分页页码和页容量，该语句紧跟查询语句
        PageHelper.startPage(page, limit);
        List<Car> cars = allCarDao.showCar();
        return cars;
    }
    //填写核对订单
    @Override
    public Car findCarByid(Integer id) {
        Car car = allCarDao.findCarByid(id);
        return car;
    }
}