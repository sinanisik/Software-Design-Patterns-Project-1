package com.isiksinan.ctis417.ShoppingCart;

import java.util.ArrayList;

public class ShoppingCart implements Observer {
    private ArrayList<Product> products;
    private int stock;
    private double totalPrice = 0;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        product.registerObserver(this);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double calculateTotalPrice() {
        totalPrice = 0;
        System.out.println("Products in the shopping cart:");
        for(Product product: products) {
            System.out.println(product.getName() + ": " + product.getPrice() + " TL");
            totalPrice += product.getPrice();
        }
       return totalPrice;
    }


    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(calculateTotalPrice());
    }

    @Override
    public void update(int stock) {
        this.stock = stock;
        products.removeIf(p -> p.getStock() == 0);
        if(stock != 0) {
            display();
        }
    }

    public void display() {
        System.out.println("Stock has changed! Current stock: " + stock);
    }


}
