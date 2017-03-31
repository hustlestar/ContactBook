package com.epam.contact.domain;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yauheni_Malashchytsk on 3/29/2017.
 */
@Entity
@Scope("session")
@Table(name = "users")
public class User implements DomainEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String nickName, String email, String password) {
        this.nickName = nickName;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

}
