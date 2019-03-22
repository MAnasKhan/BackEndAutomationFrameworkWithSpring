package com.nisum.onestopshop.be.dto.product;

public class Image
{
    private String createdDate;

    private String alternateText;

    private String imageUrl;

    private String name;

    private String updatedDate;

    public String getCreatedDate ()
    {
        return createdDate;
    }

    public void setCreatedDate (String createdDate)
    {
        this.createdDate = createdDate;
    }

    public String getAlternateText ()
    {
        return alternateText;
    }

    public void setAlternateText (String alternateText)
    {
        this.alternateText = alternateText;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUpdatedDate ()
    {
        return updatedDate;
    }

    public void setUpdatedDate (String updatedDate)
    {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [createdDate = "+createdDate+", alternateText = "+alternateText+", imageUrl = "+imageUrl+", name = "+name+", updatedDate = "+updatedDate+"]";
    }
}
