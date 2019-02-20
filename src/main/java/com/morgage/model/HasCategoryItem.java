package com.morgage.model;

import javax.persistence.*;

@Entity
public class HasCategoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "id_shop")
    private int idShop;
    @Column(name = "id_category_item")
    private int idCategoryItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    public int getIdCategoryItem() {
        return idCategoryItem;
    }

    public void setIdCategoryItem(int idCategoryItem) {
        this.idCategoryItem = idCategoryItem;
    }

    public HasCategoryItem() {
    }
}
