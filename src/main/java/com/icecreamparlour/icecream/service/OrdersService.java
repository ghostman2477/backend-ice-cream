package com.icecreamparlour.icecream.service;

import com.icecreamparlour.icecream.dto.request.OrdersRequest;
import com.icecreamparlour.icecream.dto.response.OrdersResponse;

public interface OrdersService {
    OrdersResponse createOrder(OrdersRequest orderRequest);
}
