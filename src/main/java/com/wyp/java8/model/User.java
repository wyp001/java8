package com.wyp.java8.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonFormat;

public class User implements Serializable{

    private static final long serialVersionUID = -108907189034815108L;

    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", createTime=" + createTime +
                '}';
    }
}