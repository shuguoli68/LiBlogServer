package com.example.liblogserver.service

import com.example.liblogserver.mapper.TypeMapper
import com.example.liblogserver.po.Type
import com.github.pagehelper.Page
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created on 2021/1/17 21:10
 * @author shuguo
 */
@Service
class TypeServiceImpl : TypeService {

    @Autowired
    lateinit var typeMapper: TypeMapper

    override fun saveType(type: Type): Int {
        return typeMapper.add(type)
    }

    override fun getType(id: Long): Type {
        return typeMapper.findById(id)
    }

    override fun listType(): Page<Type> {
        return typeMapper.listObj()
    }

    override fun updateType(type: Type): Int {
        return typeMapper.update(type)
    }

    override fun delType(id: Long): Int {
        return typeMapper.del(id)
    }


}