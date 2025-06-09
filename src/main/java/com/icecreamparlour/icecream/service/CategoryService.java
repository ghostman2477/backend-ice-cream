package com.icecreamparlour.icecream.service;

import com.icecreamparlour.icecream.dto.request.CategoryRequest;
import com.icecreamparlour.icecream.dto.response.CategoryResponse;
import com.icecreamparlour.icecream.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryResponse> getAllCategories();
    CategoryEntity savecategory(CategoryRequest categoryRequest);
}
