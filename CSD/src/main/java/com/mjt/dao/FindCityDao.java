package com.mjt.dao;

import com.mjt.entity.City;

import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/17  22:13
 * description:查询城市县区地址
 */
public interface FindCityDao {
    //根据pid查询取车还车地址
    public List<City> findAllCity(Integer pid);
    //根据id显示前端选择的取还车地址
    public City findCityById(Integer id);
}
