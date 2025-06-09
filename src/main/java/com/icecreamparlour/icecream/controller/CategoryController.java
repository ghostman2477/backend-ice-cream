package com.icecreamparlour.icecream.controller;


import com.icecreamparlour.icecream.dto.request.CategoryRequest;
import com.icecreamparlour.icecream.dto.response.CategoryResponse;
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
        public ResponseEntity<List<CategoryResponse>> getAllCategories() {
            List<CategoryResponse> list = categoryService.getAllCategories();
            list.forEach(System.out::println); // Optional for debugging
            return ResponseEntity.ok(list);
        }

        @PostMapping("/save-category")
        public ResponseEntity<String> savecategories(@RequestBody CategoryRequest categoryRequest){
            return new ResponseEntity<String>("Save Successful!", HttpStatus.OK);
        }
    }

