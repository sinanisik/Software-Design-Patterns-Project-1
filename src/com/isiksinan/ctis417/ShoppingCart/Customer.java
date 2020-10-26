package com.isiksinan.ctis417.ShoppingCart;

public class Customer {
    private String customerId;
    private String fullName;
    private ShoppingCart cart;


    public Customer(String customerId, String fullName) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.cart = new ShoppingCart();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
