package com.mjt.service;

import com.mjt.entity.City;

import java.util.List;

/**
 * projectName:CSD
 *
 * @author:马江涛
 * @Time: 2020/09/17  22:26
 * description:查询地址功能
 */
public interface FindCityService {
    //选择取车地址和还车地址
    public List<City> findAllCity(Integer pid);
    //通过pid查询地址在前端显示出来
    public String[] findCityById(Integer quiz1,Integer quiz2,Integer quiz3,Integer quiz4);
}
