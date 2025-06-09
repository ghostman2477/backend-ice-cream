package com.icecreamparlour.icecream.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category_ref")
public class CategoryEntity {

    @Id
    private String Id;
    private String categoryName;
    private String categoryImageURL;

    public CategoryEntity(String Id, String categoryName, String categoryImageURL) {
        this.Id = Id;
        this.categoryName = categoryName;
        this.categoryImageURL = categoryImageURL;
    }

    public CategoryEntity() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
                "id='" + Id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageURL='" + categoryImageURL + '\'' +
                '}';
    }
}
