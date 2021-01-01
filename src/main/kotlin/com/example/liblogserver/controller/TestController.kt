package com.example.liblogserver.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created on 2020/12/29 23:02
 * @author shuguo
 * 测试接口
 */

@Controller
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

    @RequestMapping(value = ["/aspect/{name}"])
    fun liAspect(@PathVariable name:String) : String{
        return name
    }

    @RequestMapping(value = ["/index"])
    fun index() : String{
        return "index"
    }
}