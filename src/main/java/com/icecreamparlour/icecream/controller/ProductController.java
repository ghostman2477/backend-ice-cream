package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.request.ProductRequest;
import com.icecreamparlour.icecream.dto.response.ProductResponse;
import com.icecreamparlour.icecream.service.ProductService;
import com.icecreamparlour.icecream.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save-product")
    public ResponseEntity<String> saveProduct(@RequestBody ProductRequest productRequest){

        productService.saveProduct(productRequest);
        return new ResponseEntity<>("Saved Successfully", HttpStatus.OK);
    }

    @GetMapping("/fetch-product")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> productResponses = productService.getAllProducts();
        return ResponseEntity.ok(productResponses);
    }

}
