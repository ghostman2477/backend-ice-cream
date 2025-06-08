package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.FlavourEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlavourRepository extends MongoRepository<FlavourEntity, String> {

    FlavourEntity findByFlavour(String flavour);
}
