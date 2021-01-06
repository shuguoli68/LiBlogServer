package com.example.liblogserver.po;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created on 2021/1/6 23:01
 *
 * @author shuguo
 */
@Entity
@Table(name = "t_blog_tags", schema = "db_li_blog", catalog = "")
public class TBlogTagsEntity extends BaseBean{
    private int id;
    private Long tagId;
    private String blogId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tag_id")
    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "blog_id")
    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBlogTagsEntity that = (TBlogTagsEntity) o;
        return id == that.id &&
                Objects.equals(tagId, that.tagId) &&
                Objects.equals(blogId, that.blogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagId, blogId);
    }
}
