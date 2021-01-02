package com.example.liblogserver.po;

import com.alibaba.fastjson.JSON;

/**
 * Created on 2021/1/2 15:12
 * @author shuguo
 * 数据表的基类
 */
public class BaseBean {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
