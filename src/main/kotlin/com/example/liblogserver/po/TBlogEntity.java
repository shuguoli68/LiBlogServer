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
@Table(name = "t_blog", schema = "db_li_blog", catalog = "")
public class TBlogEntity extends BaseBean{
    private long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private int appreciation;
    private int shareStatement;
    private int commentabled;
    private int published;
    private int recommend;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Long typeId;
    private Long userId;
    private String description;
    private String tagIds;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "first_picture")
    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    @Basic
    @Column(name = "flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "views")
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Basic
    @Column(name = "appreciation")
    public int getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(int appreciation) {
        this.appreciation = appreciation;
    }

    @Basic
    @Column(name = "share_statement")
    public int getShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(int shareStatement) {
        this.shareStatement = shareStatement;
    }

    @Basic
    @Column(name = "commentabled")
    public int getCommentabled() {
        return commentabled;
    }

    public void setCommentabled(int commentabled) {
        this.commentabled = commentabled;
    }

    @Basic
    @Column(name = "published")
    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Basic
    @Column(name = "recommend")
    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "type_id")
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "tag_ids")
    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TBlogEntity that = (TBlogEntity) o;
        return id == that.id &&
                appreciation == that.appreciation &&
                shareStatement == that.shareStatement &&
                commentabled == that.commentabled &&
                published == that.published &&
                recommend == that.recommend &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content) &&
                Objects.equals(firstPicture, that.firstPicture) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(views, that.views) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(tagIds, that.tagIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, firstPicture, flag, views, appreciation, shareStatement, commentabled, published, recommend, createTime, updateTime, typeId, userId, description, tagIds);
    }
}
