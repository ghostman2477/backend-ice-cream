package com.icecreamparlour.icecream.controller;

import com.icecreamparlour.icecream.dto.request.OrdersRequest;
import com.icecreamparlour.icecream.dto.response.OrdersResponse;
import com.icecreamparlour.icecream.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/create-order")
    public ResponseEntity<OrdersResponse> createOrder(@RequestBody OrdersRequest orderRequest) {
        OrdersResponse response = ordersService.createOrder(orderRequest);
        return ResponseEntity.ok(response);
    }
}
