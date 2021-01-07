package com.example.liblogserver.dao

import com.example.liblogserver.po.TUserEntity
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created on 2021/1/7 23:06
 * @author shuguo
 */
interface UserRepository : JpaRepository<TUserEntity, Long> {

    fun findByNamePwd(name:String, pwd:String): TUserEntity

}