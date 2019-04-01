package com.FlipkartAffiliates.fragments;

public class ProductInfo {

    /**
     * Below fields list is not a comprehensive one.
     *
     */

    private String id;
    private String title;
    private String description;
//    private Double mrp;
    private Double sellingPrice;
    private String productUrl;
    private boolean inStock;
    
//    private String productId;
//    private String title;
    private String imageUrls;
    private String image200x200;
    private String image400x400;
    private String categoryPaths;
    private Double maximumRetailPrice;
    private Double discountPercentage;
//    private Double sellingPrice;
//    private Double flipkartSpecialPrice;
//    private String productUrl;
    private String productDescription;
    private String productBrand;
//    private boolean inStock;
    private boolean isAvailable;
    private String offers;
    private Double discount;
    private Double size;
    private String color;
    private String storage;
    private String sizeUnit;
    private Double displaySize;
    private String productFamily;
    private String keySpecs;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getImage200x200() {
        return image200x200;
    }

    public void setImage200x200(String image200x200) {
        this.image200x200 = image200x200;
    }

    public String getImage400x400() {
        return image400x400;
    }

    public void setImage400x400(String image400x400) {
        this.image400x400 = image400x400;
    }
  
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    
    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    public void setMaximumRetailPrice(Double maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }
    
    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}