package com.icecreamparlour.icecream.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_ref")
public class ProductEntity {
    @Id
    private String productId;
    private String productName;
    private String productPrice;
    private String brandId;
    private String flavourId;
    private String category;

    private int inStock;
    private int partyDiscount;
    private int individualDiscount;
    private String brandName;

    private String flavourName;
    private String categoryName;

    private String productImageUrl;

    public ProductEntity() {
    }

    public ProductEntity(String productId, String productName, String productPrice,
                         String brandId, String flavourId, String category, int inStock,
                         int partyDiscount, int individualDiscount,  String productImageUrl,String brandName,
                         String flavourName, String categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.brandId = brandId;
        this.flavourId = flavourId;
        this.category = category;
        this.inStock = inStock;
        this.partyDiscount = partyDiscount;
        this.individualDiscount = individualDiscount;
        this.brandName = brandName;
        this.flavourName = flavourName;
        this.categoryName = categoryName;
        this.productImageUrl = productImageUrl;
    }

    public String getFlavourName() {
        return flavourName;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getFlavourId() {
        return flavourId;
    }

    public void setFlavourId(String flavourId) {
        this.flavourId = flavourId;
    }

    public int getPartyDiscount() {
        return partyDiscount;
    }

    public void setPartyDiscount(int partyDiscount) {
        this.partyDiscount = partyDiscount;
    }

    public int getIndividualDiscount() {
        return individualDiscount;
    }

    public void setIndividualDiscount(int individualDiscount) {
        this.individualDiscount = individualDiscount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
