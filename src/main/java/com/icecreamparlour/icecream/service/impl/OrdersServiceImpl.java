package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.dto.request.OrdersRequest;
import com.icecreamparlour.icecream.dto.request.OrdersRequest.ProductOrderRequest;
import com.icecreamparlour.icecream.dto.response.OrdersResponse;
import com.icecreamparlour.icecream.entity.OrdersEntity;
import com.icecreamparlour.icecream.entity.ProductEntity;
import com.icecreamparlour.icecream.repository.OrdersRepository;
import com.icecreamparlour.icecream.repository.ProductRepository;
import com.icecreamparlour.icecream.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public OrdersResponse createOrder(OrdersRequest orderRequest) {
        OrdersEntity order = new OrdersEntity();
        order.setName(orderRequest.getName());
        order.setPhone(orderRequest.getPhone());
        order.setAddressfirstLine(orderRequest.getAddressfirstLine());
        order.setState("West Bengal");
        order.setCity(orderRequest.getCity());
        order.setPincode(orderRequest.getPincode());
        order.setOrderStatus(orderRequest.getOrderStatus());

        // Map and update stock
        List<OrdersEntity.ProductOrder> productOrders = orderRequest.getProducts().stream().map(p -> {
            ProductEntity product = productRepository.findById(p.getProductId())
                    .orElseThrow(() -> new RuntimeException("Product not found: " + p.getProductId()));

            if (product.getInStock() < p.getQuantity()) {
                throw new RuntimeException("Insufficient stock for product: " + p.getProductId());
            }

            product.setInStock(product.getInStock() - p.getQuantity());
            productRepository.save(product);

            return new OrdersEntity.ProductOrder(p.getProductId(), p.getQuantity());
        }).collect(Collectors.toList());

        order.setProducts(productOrders);
        OrdersEntity savedOrder = ordersRepository.save(order);

        List<String> productIds = productOrders.stream()
                .map(OrdersEntity.ProductOrder::getProductId)
                .collect(Collectors.toList());

        return new OrdersResponse(savedOrder.getId(), productIds, savedOrder.getName(), savedOrder.getPhone(), savedOrder.getAddressfirstLine(),savedOrder.getCity(), savedOrder.getState(), savedOrder.getPincode(), savedOrder.getOrderStatus());
    }
}
