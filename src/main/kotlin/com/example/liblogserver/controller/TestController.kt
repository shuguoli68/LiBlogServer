package com.example.liblogserver.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created on 2020/12/29 23:02
 * @author shuguo
 * 测试接口
 */

@RestController
class TestController {
    @RequestMapping(value = ["/"])
    fun liGet():String{
//        5/0
        return "Hello"
    }

    @RequestMapping(value = ["/e"])
    fun liError(){
        5/0
    }
}