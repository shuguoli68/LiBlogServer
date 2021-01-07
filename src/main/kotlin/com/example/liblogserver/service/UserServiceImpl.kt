package com.example.liblogserver.service

import com.example.liblogserver.dao.UserRepository
import com.example.liblogserver.po.TUserEntity
import org.springframework.stereotype.Service

/**
 * Created on 2021/1/4 22:14
 * @author shuguo
 */
@Service
class UserServiceImpl : UserService{

//    @Autowired
    lateinit var userRepository: UserRepository

    override fun checkUser(name: String, password: String) :TUserEntity{
        val user = userRepository.findByNamePwd(name, password)
        return user
    }

}