package com.mjt.service.Impl;

import com.mjt.dao.FindCityDao;
import com.mjt.entity.City;
import com.mjt.service.FindCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  22:29
 * desription:查询城市功能
 */
@Service
public class FindCityServiceImpl implements FindCityService {
    @Autowired
    private FindCityDao findCityDao;
    //选择取车还车地址
    @Override
    public List<City> findAllCity(Integer pid) {
        List<City> listCity = findCityDao.findAllCity(pid);
        return listCity;
    }



    //通过pid查询地址在前端显示
    @Override
    public String[] findCityById(Integer quiz1,Integer quiz2,Integer quiz3,Integer quiz4) {
        String[] address ={findCityDao.findCityById(quiz1).getName()+findCityDao.findCityById(quiz2).getName(),
                findCityDao.findCityById(quiz3).getName()+findCityDao.findCityById(quiz4).getName()
        };

        return address;
    }
}