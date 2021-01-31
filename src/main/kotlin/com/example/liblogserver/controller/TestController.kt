package com.example.liblogserver.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created on 2020/12/29 23:02
 * @author shuguo
 * 测试接口
 */

@Api(value = "/Test", tags = arrayOf("测试服务接口的通畅性"))
@RestController
class TestController {

    @ApiOperation(value = "Get测试接口")
    @RequestMapping(value = ["/"])
    fun liGet():String{
//        5/0
        return "Hello"
    }

    @ApiOperation(value = "Get测试Error接口")
    @RequestMapping(value = ["/e"])
    fun liError(){
        5/0
    }

    @ApiOperation(value = "Get返回输入参数接口")
    @RequestMapping(value = ["/aspect/{name}"])
    fun liAspect(@PathVariable name:String) : String{
        return name
    }

    @ApiOperation(value = "Get进入index接口")
    @RequestMapping(value = ["/index"])
    fun index() : String{
        return "index"
    }
}