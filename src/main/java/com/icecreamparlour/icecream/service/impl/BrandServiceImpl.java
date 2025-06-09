package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.dto.request.BrandRequest;
import com.icecreamparlour.icecream.entity.BrandEntity;
import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.repository.BrandRepository;
import com.icecreamparlour.icecream.repository.CategoryRepository;
import com.icecreamparlour.icecream.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandRepository brandRepository;


    @Override
    public BrandEntity saveBrand(BrandRequest brandRequest) {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandName(brandRequest.getBrandName());
        return brandRepository.save(brandEntity);
    }
}
