package com.example.liblogserver.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2021/1/2 15:02
 *
 * @author shuguo
 */
@Entity
@Table(name = "t_type")
public class Type extends BaseBean{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "mType")
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
