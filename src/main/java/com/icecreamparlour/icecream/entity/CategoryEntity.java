package com.icecreamparlour.icecream.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category_ref")
public class CategoryEntity {

    @Id
    private String categoryId;
    private String categoryName;
    private String categoryImageURL;

    public CategoryEntity(String categoryId, String categoryName, String categoryImageURL) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryImageURL = categoryImageURL;
    }

    public CategoryEntity() {
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImageURL() {
        return categoryImageURL;
    }

    public void setCategoryImageURL(String categoryImageURL) {
        this.categoryImageURL = categoryImageURL;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id='" + categoryId + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageURL='" + categoryImageURL + '\'' +
                '}';
    }
}
