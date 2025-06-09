package com.icecreamparlour.icecream.controller;


import com.icecreamparlour.icecream.dto.request.CategoryRequest;
import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/categories")
    public class CategoryController {

        @Autowired
        private CategoryService categoryService;

        @GetMapping("/fetch")
        public ResponseEntity<List<CategoryEntity>> getAllCategories() {
            List<CategoryEntity> list = categoryService.getAllCategories();
            return ResponseEntity.ok(list);

        }

        @PostMapping("/savecategory")
        public ResponseEntity<String> savecategories(@RequestBody CategoryRequest categoryRequest){
            return new ResponseEntity<String>("Save Successful!", HttpStatus.OK);
        }
    }

