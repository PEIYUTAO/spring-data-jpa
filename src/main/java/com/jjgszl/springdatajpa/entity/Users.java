package com.jjgszl.springdatajpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userid")
    private Integer userId;
    @Column(name="username")
    private String userName;
    @Column(name="userage")
    private Integer userAge;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
