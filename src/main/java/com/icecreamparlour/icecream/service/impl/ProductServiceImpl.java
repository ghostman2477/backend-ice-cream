package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.dto.request.ProductRequest;
import com.icecreamparlour.icecream.entity.BrandEntity;
import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.entity.FlavourEntity;
import com.icecreamparlour.icecream.entity.ProductEntity;
import com.icecreamparlour.icecream.repository.BrandRepository;
import com.icecreamparlour.icecream.repository.CategoryRepository;
import com.icecreamparlour.icecream.repository.FlavourRepository;
import com.icecreamparlour.icecream.repository.ProductRepository;
import com.icecreamparlour.icecream.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private FlavourRepository flavourRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ProductEntity saveProduct(ProductRequest productRequest) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(productRequest.getProductName());
        productEntity.setProductPrice(productRequest.getProductPrice());

        System.out.println(productRequest.getBrandName());

        Optional<BrandEntity> brand = brandRepository.findByBrandName(productRequest.getBrandName());
        if (brand.isPresent()) {
            productEntity.setBrandId(brand.get().getBrandId());
        } else {
            throw new RuntimeException("Brand not found: " + productRequest.getBrandName());
        }

        FlavourEntity flavourEntity = flavourRepository.findByFlavour(productRequest.getFlavourName());
        CategoryEntity categoryEntity = categoryRepository.findByCategoryName(productRequest.getCategory());
        productEntity.setInStock(productRequest.getInStock());
//        productEntity.setCategory(categoryEntity.getCategoryId());
        productEntity.setFlavourId(flavourEntity.getFlavourId());
        productEntity.setIndividualDiscount(productRequest.getIndividualDiscount());
        productEntity.setPartyDiscount(productRequest.getPartyDiscount());
        productEntity.setProductImageUrl(productRequest.getProductImageUrl());

        return productRepository.save(productEntity);
    }
}
