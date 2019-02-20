//package com.morgage.model;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "has_category_item")
////@Indexed
//public class HasCategoryItem implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idhas_category_item")
//    private Integer id;
//    @Column(name = "id_shop")
//    private int idShop;
//    @Column(name = "id_category_item")
//    private int idCategoryItem;
//
//    public HasCategoryItem() {
//    }
//
//    public HasCategoryItem(int idShop, int idCategoryItem) {
//        this.idShop = idShop;
//        this.idCategoryItem = idCategoryItem;
//    }
//    public int getIdShop() {
//        return idShop;
//    }
//
//
//    public int getIdCategoryItem() {
//        return idCategoryItem;
//    }
//
//    public void setIdCategoryItem(int idCategoryItem) {
//        this.idCategoryItem = idCategoryItem;
//    }
//}
