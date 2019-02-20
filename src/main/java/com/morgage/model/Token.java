package com.morgage.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "token")
//@Indexed
public class Token implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "token")
    private String token;

    public Token() {
    }

    public Token(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
