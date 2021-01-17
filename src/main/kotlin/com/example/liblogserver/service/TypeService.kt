package com.example.liblogserver.service

import com.example.liblogserver.po.Type
import com.github.pagehelper.Page

/**
 * Created on 2021/1/17 21:06
 * @author shuguo
 */
interface TypeService {
    fun saveType(type:Type):Int
    fun getType(id:Long):Type
    fun listType():Page<Type>
    fun updateType(type:Type):Int
    fun delType(id:Long):Int
}