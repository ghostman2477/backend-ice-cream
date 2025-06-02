package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.repository.CategoryRepository;
import com.icecreamparlour.icecream.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }
}
