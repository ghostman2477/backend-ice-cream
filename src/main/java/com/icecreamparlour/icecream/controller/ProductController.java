package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.request.ProductRequest;
import com.icecreamparlour.icecream.service.ProductService;
import com.icecreamparlour.icecream.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/saveproduct")
    public ResponseEntity<String> saveProduct(@RequestBody ProductRequest productRequest){

        productService.saveProduct(productRequest);
        return new ResponseEntity<>("Saved Successfully", HttpStatus.OK);
    }
}
