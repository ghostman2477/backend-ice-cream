package com.icecreamparlour.icecream.service;

import com.icecreamparlour.icecream.dto.request.ProductRequest;
import com.icecreamparlour.icecream.dto.response.ProductResponse;
import com.icecreamparlour.icecream.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductEntity saveProduct(ProductRequest ProductRequest);

    List<ProductResponse> getAllProducts();
}
