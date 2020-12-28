package com.example.liblogserver.handler

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

/**
 * Created on 2020/12/28 22:53
 * @author shuguo
 */

@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(Exception::class)
    fun exceptionHandler (request:HttpServletRequest, e:Exception) : ModelAndView {
        val mv = ModelAndView()
        mv.addObject("url", request.requestURI)
        mv.addObject("exception", e)
        mv.viewName = "error/error"
        return mv
    }
}