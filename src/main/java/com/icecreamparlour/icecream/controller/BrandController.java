package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.request.BrandRequest;
import com.icecreamparlour.icecream.service.BrandService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("/savebrand")
    public ResponseEntity<String> saveBrand(@RequestBody BrandRequest brandRequest){
        brandService.saveBrand(brandRequest);
        return new ResponseEntity<String>("Saved Successfully", HttpStatus.OK);
    }
}
