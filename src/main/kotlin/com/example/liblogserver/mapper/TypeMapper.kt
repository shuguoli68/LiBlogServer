package com.example.liblogserver.mapper

import com.example.liblogserver.po.Type
import com.example.liblogserver.po.User
import com.github.pagehelper.Page
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update
import org.springframework.stereotype.Repository

/**
 * Created on 2021/1/17 21:11
 * @author shuguo
 */
@Repository
interface TypeMapper {
    @Insert("INSERT INTO `t_type` VALUES(#{id},#{name})")
    fun add(type: Type):Int

    @Delete("DELETE FROM `t_type` WHERE id = #{id}")
    fun del(id: Long):Int

    @Update("UPDATE `t_type`\n" +
            "        SET name = #{name}\n" +
            "        WHERE id = #{id}")
    fun update(type: Type):Int

    @Select("SELECT * FROM `t_type` WHERE id = #{id}")
    fun findById(id: Long): Type

    @Select("select * from `t_type`")
    fun listObj(): Page<Type>
}