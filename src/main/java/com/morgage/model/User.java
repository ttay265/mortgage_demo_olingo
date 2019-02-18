package com.morgage.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account")
//@Indexed
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "username")
    private String username;
    @Column(name = "status")
    private int status;

    public User() {
    }

    public User(int roleId, String username, int status) {
        this.roleId = roleId;
        this.username = username;
        this.status = status;
    }
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
