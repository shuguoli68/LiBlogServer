package com.example.liblogserver.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created on 2021/1/31 21:52
 * @author shuguo
 * 重定向路径
 */
@Controller
class RedirectCtl {

    @RequestMapping("/toLogin")
    fun loginPage():String{
        return "admin/login"
    }

    @RequestMapping("/toIndex")
    fun indexPage():String{
        return "admin/index"
    }

}