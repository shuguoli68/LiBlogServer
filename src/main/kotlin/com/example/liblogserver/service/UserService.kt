package com.example.liblogserver.service

import com.example.liblogserver.po.User

/**
 * Created on 2021/1/4 22:12
 * @author shuguo
 */
interface UserService {
    fun addUser(user:User):Int
    fun checkUser(name:String, password:String):User
}