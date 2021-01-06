package com.example.liblogserver.dao

import com.example.liblogserver.po.TUserEntity
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created on 2021/1/6 23:09
 * @author shuguo
 */
interface UserRepository : JpaRepository<TUserEntity, Long>{

    fun findByNamePwd(name:String, pwd:String):TUserEntity

}