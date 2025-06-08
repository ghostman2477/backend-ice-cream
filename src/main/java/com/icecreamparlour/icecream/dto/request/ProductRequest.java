package com.icecreamparlour.icecream.dto.request;

public class ProductRequest {

    private String productName;
    private String productPrice;
    private String brandName;
    private String flavourName;
    private String category;
    private String partyDiscount;
    private String individualDiscount;

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    private String inStock;

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    private  String productImageUrl;

    public String getFlavourName() {
        return flavourName;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

}
