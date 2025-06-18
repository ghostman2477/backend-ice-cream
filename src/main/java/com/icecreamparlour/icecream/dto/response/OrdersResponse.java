package com.icecreamparlour.icecream.dto.response;

import java.util.List;

public class OrdersResponse {
    private String orderId;
    private List<String> productIds;
    private String name;
    private String phone;
    private String address;

    public OrdersResponse(String orderId, List<String> productIds, String name, String phone, String address) {
        this.orderId = orderId;
        this.productIds = productIds;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getOrderId() { return orderId; }
    public List<String> getProductIds() { return productIds; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}
