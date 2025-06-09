package com.icecreamparlour.icecream.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "brand")
public class BrandEntity {
    @Id
    private String brandId;
    private String brandName;

    public BrandEntity() {
    }

    public BrandEntity(String brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "BrandEntity{" +
                "brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
