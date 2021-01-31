package com.example.liblogserver.controller

import com.example.liblogserver.po.User
import com.example.liblogserver.response.BaseResponse
import com.example.liblogserver.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

/**
 * Created on 2021/1/6 23:18
 * @author shuguo
 */
@Api(value = "/Login", tags = arrayOf("登录注册相关接口"))
@RestController
class LoginController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping("/admin")
    @ResponseBody
    fun loginPage():String{
        return "admin/login"
    }

    @PostMapping("/index")
    @ResponseBody
    fun indexPage():String{
        return "admin/index"
    }

    @ApiOperation(value = "登录")
    @PostMapping("/login")
    @ResponseBody
    fun login(@RequestParam name:String, @RequestParam pwd:String, session:HttpSession, attributes:RedirectAttributes, response: HttpServletResponse){
        val user = userService.checkUser(name, pwd)
        if (user != null){
            user.password = ""
            session.setAttribute("user", user)
            response.sendRedirect("/index")
        }else{
            attributes.addFlashAttribute("message", "用户名或密码错误")
            response.sendRedirect("/admin")
        }
    }

    @ApiOperation(value = "登出")
    @PostMapping("/logout")
    fun logout(session: HttpSession, response: HttpServletResponse){
        session.removeAttribute("user")
        response.sendRedirect("redirect:/admin")
    }

    @ApiOperation(value = "注册")
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

    @ApiOperation(value = "已注册用户列表")
    @PostMapping("/user/list")
    fun list():BaseResponse<List<User>>{
        val value = userService.listUser()
        return BaseResponse(1, "已注册用户", value)
    }
}