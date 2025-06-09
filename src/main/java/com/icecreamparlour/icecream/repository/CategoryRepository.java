package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.entity.FlavourEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryEntity, String> {
    CategoryEntity findByCategoryName(String categoryName);
}
