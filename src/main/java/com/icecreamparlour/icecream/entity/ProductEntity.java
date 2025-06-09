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

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    private String inStock;
    private String partyDiscount;
    private String individualDiscount;

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    private  String productImageUrl;

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

    public String getPartyDiscount() {
        return partyDiscount;
    }

    public void setPartyDiscount(String partyDiscount) {
        this.partyDiscount = partyDiscount;
    }

    public String getIndividualDiscount() {
        return individualDiscount;
    }

    public void setIndividualDiscount(String individualDiscount) {
        this.individualDiscount = individualDiscount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
