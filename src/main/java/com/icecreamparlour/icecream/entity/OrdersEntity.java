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
    private String address;

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
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<ProductOrder> getProducts() { return products; }
    public void setProducts(List<ProductOrder> products) { this.products = products; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
