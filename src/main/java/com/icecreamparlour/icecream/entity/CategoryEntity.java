package com.icecreamparlour.icecream.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category_ref")
public class CategoryEntity {

    @Id
    private String id;
    private String categoryName;
    private String categoryImageURL;

    public CategoryEntity(String id, String categoryName, String categoryImageURL) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryImageURL = categoryImageURL;
    }

    public CategoryEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
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
                "id='" + id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageURL='" + categoryImageURL + '\'' +
                '}';
    }
}
