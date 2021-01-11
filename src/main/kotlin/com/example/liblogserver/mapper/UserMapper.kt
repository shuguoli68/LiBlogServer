package com.example.liblogserver.mapper

import com.example.liblogserver.po.User
import com.github.pagehelper.Page
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update
import org.springframework.stereotype.Repository

/**
 * Created on 2021/1/11 22:04
 * @author shuguo
 */
@Repository
interface UserMapper {
    @Insert("INSERT INTO `t_user` VALUES(#{id},#{nickname},#{username},#{password},#{email},#{avatar},#{type},#{createTime},#{updateTime})")
    fun addUser(user: User):Int

    @Delete("DELETE FROM `t_user` WHERE id = #{id}")
    fun delUser(id: Int):Int

    @Update("UPDATE `t_user`\n" +
            "        SET nickname = #{nickname}, email = #{email}, avatar = #{avatar}, type = #{type}, update_time = #{updateTime}\n" +
            "        WHERE id = #{id}")
    fun upUser(user: User):Int

    @Select("SELECT * FROM `t_user` WHERE username = #{name} AND password = #{password}")
    fun findByNamePwd(name: String, password: String):User

    @Select("select * from `t_user`")
    fun listUser(): Page<User>
}