package com.nisum.onestopshop.be.dto.product;

import java.util.List;

public class Product
{
    private List<Long> categoryId;

    private List<ImageDto> images;

    private String unit;

    public List<Long> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Long> categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isStatus() {
        return status;
    }

    private String createdDate;

    private String description;

    private List<StockItem> stockItem;

    private String updatedDate;

    private List<Tag> tag;

    private String title;

    private boolean status;

    public List<ImageDto> getImages ()
    {
        return images;
    }

    public void setImages (List<ImageDto> image)
    {
        this.images = image;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getCreatedDate ()
    {
        return createdDate;
    }

    public void setCreatedDate (String createdDate)
    {
        this.createdDate = createdDate;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public List<StockItem> getStockItem ()
    {
        return stockItem;
    }

    public void setStockItem (List<StockItem> stockItem)
    {
        this.stockItem = stockItem;
    }

    public String getUpdatedDate ()
    {
        return updatedDate;
    }

    public void setUpdatedDate (String updatedDate)
    {
        this.updatedDate = updatedDate;
    }

    public List<Tag> getTag ()
    {
        return tag;
    }

    public void setTag (List<Tag> tag)
    {
        this.tag = tag;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public boolean getStatus ()
    {
        return status;
    }

    public void setStatus (boolean status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image = "+images+", unit = "+unit+", createdDate = "+createdDate+", description = "+description+", stockItem = "+stockItem+", updatedDate = "+updatedDate+", tag = "+tag+", title = "+title+", status = "+status+"]";
    }
}