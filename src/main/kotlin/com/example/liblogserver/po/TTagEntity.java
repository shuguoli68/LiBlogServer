package com.example.liblogserver.po;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created on 2021/1/6 23:01
 *
 * @author shuguo
 */
@Entity
@Table(name = "t_tag", schema = "db_li_blog", catalog = "")
public class TTagEntity extends BaseBean{
    private long id;
    private String name;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTagEntity that = (TTagEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
