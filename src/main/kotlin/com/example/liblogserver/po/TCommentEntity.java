package com.example.liblogserver.po;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created on 2021/1/6 23:01
 *
 * @author shuguo
 */
@Entity
@Table(name = "t_comment", schema = "db_li_blog", catalog = "")
public class TCommentEntity extends BaseBean{
    private long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Timestamp createTime;
    private Long blogId;
    private Long parentCommentId;
    private Integer admincomment;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "blog_id")
    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "parent_comment_id")
    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    @Basic
    @Column(name = "admincomment")
    public Integer getAdmincomment() {
        return admincomment;
    }

    public void setAdmincomment(Integer admincomment) {
        this.admincomment = admincomment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCommentEntity that = (TCommentEntity) o;
        return id == that.id &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(email, that.email) &&
                Objects.equals(content, that.content) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(blogId, that.blogId) &&
                Objects.equals(parentCommentId, that.parentCommentId) &&
                Objects.equals(admincomment, that.admincomment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, email, content, avatar, createTime, blogId, parentCommentId, admincomment);
    }
}
