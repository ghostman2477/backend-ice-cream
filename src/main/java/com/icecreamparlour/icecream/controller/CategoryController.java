package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.Category;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    ArrayList<Category> categoriesList = new ArrayList<>();

    @PostConstruct
    public void init(){
        categoriesList.add(new Category(1,"Cornetto","abc"));
        categoriesList.add(new Category(2,"Cones","abc"));
        categoriesList.add(new Category(3,"Cup","abc"));
        categoriesList.add(new Category(4,"Stick","abc"));
        categoriesList.add(new Category(5,"Tub","abc"));
        categoriesList.add(new Category(6,"Sandwich","abc"));
    }

    @GetMapping({"/fetchAllCategory", "/fetchAllCategory/"}) // Maps GET requests to fetch categories
    public ResponseEntity<List<Category>> getAllCategories() {


        System.out.println("Clicked");
        return new ResponseEntity<>(categoriesList, HttpStatus.OK);
    }
}
