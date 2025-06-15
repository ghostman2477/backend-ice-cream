package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {
    @Query("{ 'category' : ?0 }")
    List<ProductEntity> findByCategory(String category);
}
