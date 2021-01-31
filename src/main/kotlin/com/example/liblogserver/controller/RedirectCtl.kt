package com.example.liblogserver.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created on 2021/1/31 21:52
 * @author shuguo
 * 重定向路径
 */
@Controller
class RedirectCtl {

    @GetMapping("/toLogin")
    fun loginPage():String{
        return "admin/login"
    }

    @GetMapping("/toIndex")
    fun indexPage():String{
        return "admin/index"
    }

}