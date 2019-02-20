package com.morgage.model;


import javax.persistence.*;

@Entity
public class CategoryGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name="category_groupName")
    private String categoryGropName;
    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryGropName() {
        return categoryGropName;
    }

    public void setCategoryGropName(String categoryGropName) {
        this.categoryGropName = categoryGropName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryGroup() {
    }
}
