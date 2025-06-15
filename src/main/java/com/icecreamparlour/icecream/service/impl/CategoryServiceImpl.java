package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.dto.request.CategoryRequest;
import com.icecreamparlour.icecream.dto.response.CategoryResponse;
import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.repository.CategoryRepository;
import com.icecreamparlour.icecream.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAllCategories() {
        List<CategoryEntity> entities = categoryRepository.findAll();
        return entities.stream()
                .map(entity -> new CategoryResponse(
                        entity.getId(),
                        entity.getCategoryName(),
                        entity.getCategoryImageURL()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryEntity savecategory(CategoryRequest categoryRequest) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryName(categoryRequest.getCategory());
        categoryEntity.setCategoryImageURL(categoryRequest.getCategoryImageURL());
        return categoryRepository.save(categoryEntity);

    }
}
