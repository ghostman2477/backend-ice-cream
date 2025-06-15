package com.icecreamparlour.icecream.repository;

import com.icecreamparlour.icecream.entity.OrdersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrdersEntity, String> {
}
