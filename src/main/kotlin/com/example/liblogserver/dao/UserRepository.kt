package com.example.liblogserver.dao

import com.example.liblogserver.po.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created on 2021/1/7 23:06
 * @author shuguo
 */
interface UserRepository : JpaRepository<User, Long> {

    fun findByNamePwd(name:String, pwd:String): User

}