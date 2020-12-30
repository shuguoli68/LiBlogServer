package com.example.liblogserver.handler

import org.slf4j.Logger
import org.slf4j.LoggerFactory
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

    private val logger:Logger = LoggerFactory.getLogger("LiBlog")

    @ExceptionHandler(Exception::class)
    fun exceptionHandler (request:HttpServletRequest, e:Exception) : ModelAndView {
        logger.error("Request URL :{}, Exception:{}", request.requestURI, e)
        val mv = ModelAndView()
        mv.addObject("url", request.requestURI)
        mv.addObject("exception", e)
        mv.viewName = "error/error"
        return mv
    }
}