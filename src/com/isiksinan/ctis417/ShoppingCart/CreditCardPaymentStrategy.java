package com.isiksinan.ctis417.ShoppingCart;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Customer pays " + amount + " by using credit card");
    }
}
