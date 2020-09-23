package com.mjt.entity;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  22:10
 * desription:城市实体类
 */
public class City {
    private Integer id;
    private String name;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}