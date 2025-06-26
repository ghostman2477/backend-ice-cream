package com.icecreamparlour.icecream.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
public class OrdersEntity {
    @Id
    private String id;
    private List<ProductOrder> products;
    private String phone;
    private String name;
    private String addressfirstLine;
    private String city;
    private String state;
    private String pincode;


    private String orderStatus;

    public static class ProductOrder {
        private String productId;
        private int quantity;

        public ProductOrder() {}

        public ProductOrder(String productId, int quantity) {
            this.productId = productId;
            this.quantity = quantity;
        }

        public String getProductId() { return productId; }
        public void setProductId(String productId) { this.productId = productId; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }
    }

    // Getters and Setters
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<ProductOrder> getProducts() { return products; }
    public void setProducts(List<ProductOrder> products) { this.products = products; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddressfirstLine() { return addressfirstLine; }
    public void setAddressfirstLine(String addressfirstLine) { this.addressfirstLine = addressfirstLine; }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
