package com.icecreamparlour.icecream.dto.response;

public class CategoryResponse {

    private String id;
    private String categoryName;
    private String categoryImageURL;

    public CategoryResponse() {
    }

    public CategoryResponse(String id, String categoryName, String categoryImageURL) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryImageURL = categoryImageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "CategoryResponse{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", categoryImageURL='" + categoryImageURL + '\'' +
                '}';
    }
}
