package com.example.liblogserver.response

/**
 * Created on 2021/1/11 22:02
 * @author shuguo
 */

data class BaseResponse<T>(
        var code:Int,
        var msg:String,
        var data:T
)