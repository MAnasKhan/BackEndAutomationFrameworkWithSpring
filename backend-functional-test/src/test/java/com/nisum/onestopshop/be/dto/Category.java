package com.nisum.onestopshop.be.dto;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    private Long id;
    private String categoryName;
    private String categoryDescription;
    private List<Category> categories;

    public Category() {
    }

    public Category(Long id, String categoryName, String categoryDescription, List<Category> categories) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categories = categories;
    }


    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Category(Long id, List<Category> subCategories) {
        this.id = id;
        this.categories = subCategories;
    }

    public Long getId() {


        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                ", categories=" + categories +
                '}';
    }
}
