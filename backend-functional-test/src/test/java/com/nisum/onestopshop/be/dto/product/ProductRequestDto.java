package com.nisum.onestopshop.be.dto.product;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ProductRequestDto {

    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String unit;
    @NotNull
    private boolean status;

    private Date createdDate;

    private Date updatedDate;

    public Date getCreatedDate() { return createdDate; }

    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }

    public Date getUpdatedDate() { return updatedDate; }

    public void setUpdatedDate(Date updatedDate) { this.updatedDate = updatedDate; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
