package com.mjt.common;

/**
 * projectName: CSD
 *
 * @author: 马江涛
 * time:2020/09/17  14:44
 * desription:返回前端json格式类
 */
public class JsonResult {
    private Integer code;
    private Object info;

    public JsonResult() {
    }

    public JsonResult(Integer code, Object info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}