package com.icecreamparlour.icecream.dto.response;

import java.util.List;

public class OrdersResponse {
    private String orderId;
    private List<String> productIds;
    private String name;
    private String phone;
    private String addressfirstLine;
    private String city;
    private String state;
    private String pincode;



    private String orderStatus;

    public OrdersResponse(String orderId, List<String> productIds, String name, String phone, String addressfirstLine, String city,String state,String pincode,String orderStatus) {
        this.orderId = orderId;
        this.productIds = productIds;
        this.name = name;
        this.phone = phone;
        this.addressfirstLine = addressfirstLine;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.orderStatus = orderStatus;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public String getOrderId() { return orderId; }
    public List<String> getProductIds() { return productIds; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddressfirstLine() { return addressfirstLine; }
    public String getState() { return state; }

    public String getCity() { return city;}

    public String getPincode() {return pincode;}

}
