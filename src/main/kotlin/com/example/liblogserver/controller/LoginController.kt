package com.example.liblogserver.controller

import com.example.liblogserver.po.User
import com.example.liblogserver.response.BaseResponse
import com.example.liblogserver.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import javax.servlet.http.HttpSession

/**
 * Created on 2021/1/6 23:18
 * @author shuguo
 */
@Controller
@RequestMapping("/admin")
class LoginController {

    @Autowired
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

    @PostMapping("/register")
    fun login(@RequestBody user:User):BaseResponse<Boolean>{
        val value = userService.addUser(user)
        val response = BaseResponse(1, "注册成功！", true)
        if (value < 0){
            response.code = -1
            response.msg = "注册失败"
            response.data = false
        }
        return response
    }

    @PostMapping("/user/list")
    fun list():BaseResponse<List<User>>{
        val value = userService.listUser()
        return BaseResponse(1, "已注册用户", value)
    }
}