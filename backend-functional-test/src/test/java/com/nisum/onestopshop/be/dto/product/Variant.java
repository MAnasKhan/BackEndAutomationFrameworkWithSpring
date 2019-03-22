package com.nisum.onestopshop.be.dto.product;

public class Variant
{
    private String productId;

    private String attributeName;

    private String attributeVariant;

    private String sequenceId;

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    public String getAttributeName ()
    {
        return attributeName;
    }

    public void setAttributeName (String attributeName)
    {
        this.attributeName = attributeName;
    }

    public String getAttributeVariant ()
    {
        return attributeVariant;
    }

    public void setAttributeVariant (String attributeVariant)
    {
        this.attributeVariant = attributeVariant;
    }

    public String getSequenceId ()
    {
        return sequenceId;
    }

    public void setSequenceId (String sequenceId)
    {
        this.sequenceId = sequenceId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [productId = "+productId+", attributeName = "+attributeName+", attributeVariant = "+attributeVariant+", sequenceId = "+sequenceId+"]";
    }
}