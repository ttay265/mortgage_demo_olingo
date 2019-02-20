//package com.morgage.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "district")
////@Indexed
//public class District implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "DistrictId")
//    private Integer id;
//    @Column(name = "DistrictName")
//    private String districtName;
//    @Column(name = "Description")
//    private String description;
//
//    public District(String districtName, String description) {
//        this.districtName = districtName;
//        this.description = description;
//    }
//
//    public District() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//
//    public String getDistrictName() {
//        return districtName;
//    }
//
//    public void setDistrictName(String districtName) {
//        this.districtName = districtName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}
