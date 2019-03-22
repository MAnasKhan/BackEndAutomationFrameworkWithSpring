package com.nisum.onestopshop.be.dto;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {
    private Long id;
    private String name;
    private String deptDescription;
    private List<Category> categories;


    public Department() {

    }

    public Department(Long id, String deptName, String deptDescription, List<Category> categories) {
        this.id = id;
        this.name = deptName;
        this.deptDescription = deptDescription;
        this.categories = categories;
    }

    public String getDeptDescription() {
        return deptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptDescription='" + deptDescription + '\'' +
                ", categories=" + categories +
                '}';
    }
}
