package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {
}
