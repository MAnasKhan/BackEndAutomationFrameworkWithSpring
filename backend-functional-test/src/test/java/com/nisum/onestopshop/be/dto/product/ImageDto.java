package com.nisum.onestopshop.be.dto.product;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class ImageDto {
    public Long getAssociateId() {
        return associateId;
    }

    public void setAssociateId(Long associateId) {
        this.associateId = associateId;
    }

    Long id;
    String name;

    public String getAssociateTableName() {
        return associateTableName;
    }

    public void setAssociateTableName(String associateTableName) {
        this.associateTableName = associateTableName;
    }

    String alterText;
    String imagePath;
    String status;
    Date createdDate;
    Date updatedDate;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    Long associateId;
    String associateTableName;
    MultipartFile image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlterText() {
        return alterText;
    }

    public void setAlterText(String alterText) {
        this.alterText = alterText;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
