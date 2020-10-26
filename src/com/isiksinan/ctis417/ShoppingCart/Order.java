package com.isiksinan.ctis417.ShoppingCart;

public class Order {

    private String orderId;
    private Customer customerDetails;
    private ShoppingCart cart = new ShoppingCart();

    public Order(String orderId, Customer customerDetails, ShoppingCart cart) {
        this.orderId = orderId;
        this.customerDetails = customerDetails;
        this.cart = cart;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
