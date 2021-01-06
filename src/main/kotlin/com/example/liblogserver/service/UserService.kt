package com.example.liblogserver.service

import com.example.liblogserver.po.TUserEntity

/**
 * Created on 2021/1/4 22:12
 * @author shuguo
 */
interface UserService {
    fun checkUser(name:String, password:String):TUserEntity
}