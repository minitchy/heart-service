package com.bnpro.heartservice.repository.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="USER")
public class User {

    public User() {}

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Id
    @Column(name="ID")
    private long id;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="NAME")
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="CREATED_DATETIME")
    private Date createdDate;

    @Column(name="LAST_MODIFIED_DATETIME")
    private Date lastModifiedDate;

    @PrePersist
    public void preInsert() {
        setCreatedDate(new Date());
        setLastModifiedDate(new Date());
    }

    @PreUpdate
    public void preUpdate() {
        setLastModifiedDate(new Date());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    private void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    private void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
