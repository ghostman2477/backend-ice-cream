package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.request.FlavourRequest;
import com.icecreamparlour.icecream.service.BrandService;
import com.icecreamparlour.icecream.service.FlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flavour")
public class FlavourController {



    @Autowired
    private FlavourService flavourService;

    @PostMapping("/saveflavour")
    public ResponseEntity<String> saveFlavour(@RequestBody FlavourRequest flavourRequest){
        flavourService.saveFlavour(flavourRequest);
        return new ResponseEntity<String>("Saved Successfully", HttpStatus.OK);
    }
}
