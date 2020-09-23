package com.mjt.vo;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/19  16:15
 * desription:前端展示对应实体类
 */
public class OrderVo {
    private Integer id;
    private Double oprice;
    private String name;
    private String getCar;
    private String backCar;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getOprice() {
        return oprice;
    }

    public void setOprice(Double oprice) {
        this.oprice = oprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGetCar() {
        return getCar;
    }

    public void setGetCar(String getCar) {
        this.getCar = getCar;
    }

    public String getBackCar() {
        return backCar;
    }

    public void setBackCar(String backCar) {
        this.backCar = backCar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}