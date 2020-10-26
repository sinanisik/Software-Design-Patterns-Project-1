package com.isiksinan.ctis417.ShoppingCart;

public class PaypalPaymentStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Customer pays " + amount + " by using PayPal.");
    }
}
