package com.nisum.onestopshop.be.dto.product;

public class StockItem
{
    private Long productId;

    private String sku;

    private String barCode;

    private String inventoryPolicy;

    private String quantity;

    private String price;

    private boolean outOfStock;

    private double costPerItem ;

    private double compareAtPrice;

    private boolean status;

    private long sequenceId;

    private Variant[] variant;

    public Long getProductId ()
    {
        return productId;
    }

    public void setProductId (Long productId)
    {
        this.productId = productId;
    }

    public String getSku ()
    {
        return sku;
    }

    public void setSKU (String sku)
    {
        this.sku = sku;
    }

    public String getBarCode ()
    {
        return barCode;
    }

    public void setBarCode (String barCode)
    {
        this.barCode = barCode;
    }

    public String getInventoryPolicy ()
    {
        return inventoryPolicy;
    }

    public void setInventoryPolicy (String inventoryPolicy)
    {
        this.inventoryPolicy = inventoryPolicy;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public boolean getOutOfStock ()
    {
        return outOfStock;
    }

    public void setOutOfStock (boolean outOfStock)
    {
        this.outOfStock = outOfStock;
    }

    public double getCostPerItem ()
    {
        return costPerItem;
    }

    public void setCostPerItem (double costPerItem)
    {
        this.costPerItem = costPerItem;
    }

    public double getCompareAtPrice ()
    {
        return compareAtPrice;
    }

    public void setCompareAtPrice (double compareAtPrice)
    {
        this.compareAtPrice = compareAtPrice;
    }

    public boolean getStatus () { return status; }

    public void setStatus (boolean status)
    {
        this.status = status;
    }

    public void setSequenceId(long sequenceId) { this.sequenceId = sequenceId; }

    public long getSequenceId() { return sequenceId; }

    public Variant[] getVariant ()
    {
        return variant;
    }

    public void setVariant (Variant[] variant)
    {
        this.variant = variant;
    }





    @Override
    public String toString()
    {
        return "StockItem [quantity = "+quantity+", productId = "+productId+", price = "+price+", inventoryPolicy = "+inventoryPolicy+", outOfStock = "+outOfStock+", variant = "+variant+", SKU = "+sku+", costPerItem = "+costPerItem+", barCode = "+barCode+", compareAtPrice = "+compareAtPrice+", status = "+status+"]";
    }
}
