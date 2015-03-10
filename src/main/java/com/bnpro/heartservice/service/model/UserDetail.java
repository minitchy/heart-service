package com.bnpro.heartservice.service.model;

import java.util.Date;

public class UserDetail {

    public UserDetail(String name, String email, Date createdDate) {
        this.name = name;
        this.email = email;
        this.createdDate = createdDate;
    }

    private String name;
    private String email;
    private Date createdDate;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
