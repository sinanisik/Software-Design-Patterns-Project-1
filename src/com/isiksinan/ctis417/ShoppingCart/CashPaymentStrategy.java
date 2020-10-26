package com.isiksinan.ctis417.ShoppingCart;

public class CashPaymentStrategy implements PaymentStrategy {


    @Override
    public void pay(double amount) {
        System.out.println("Customer pays " + amount + " as a cash");
    }
}
