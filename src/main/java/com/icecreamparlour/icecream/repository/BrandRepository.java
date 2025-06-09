package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.BrandEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface BrandRepository extends MongoRepository<BrandEntity, String> {
    @Query("{ 'brandName' : ?0 }")
    Optional<BrandEntity> findByBrandName(String brandName);
    Optional<BrandEntity> findById(String id);

}
