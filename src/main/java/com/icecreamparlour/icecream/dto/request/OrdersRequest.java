package com.icecreamparlour.icecream.dto.request;

import java.util.List;

public class OrdersRequest {
    private List<ProductOrderRequest> products;
    private String phone;
    private String name;
    private String address;

    public static class ProductOrderRequest {
        private String productId;
        private int quantity;

        public String getProductId() { return productId; }
        public void setProductId(String productId) { this.productId = productId; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    public List<ProductOrderRequest> getProducts() { return products; }
    public void setProducts(List<ProductOrderRequest> products) { this.products = products; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
