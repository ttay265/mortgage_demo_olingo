//package com.morgage.model;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "pawner")
////@Indexed
//public class Pawner implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name = "name")
//    private String name;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "phone_number")
//    private String phoneNumber;
//
//    public Pawner() {
//    }
//
//    public Pawner(String name, String email, String phoneNumber) {
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//}
