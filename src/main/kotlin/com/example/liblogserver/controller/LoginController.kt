package com.example.liblogserver.controller

import com.example.liblogserver.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import javax.servlet.http.HttpSession

/**
 * Created on 2021/1/6 23:18
 * @author shuguo
 */
@Controller
@RequestMapping("/admin")
class LoginController {

//    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun loginPage():String{
        return "admin/login"
    }

    @PostMapping("/login")
    fun login(@RequestParam name:String, @RequestParam pwd:String, session:HttpSession, attributes:RedirectAttributes):String{
        val user = userService.checkUser(name, pwd)
        if (user != null){
            user.password = ""
            session.setAttribute("user", user)
            return "admin/index"
        }else{
            attributes.addFlashAttribute("message", "用户名或密码错误")
            return "redirect:/admin"
        }
    }

    @GetMapping("/logout")
    fun logout(session: HttpSession):String{
        session.removeAttribute("user")
        return "redirect:/admin"
    }
}