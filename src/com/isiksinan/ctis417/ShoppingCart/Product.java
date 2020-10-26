package com.isiksinan.ctis417.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i); }
    }

    public void stockChanged() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        //System.out.println("observer: " + observers.size());
        for(Observer observer: observers) {
            if(stock == 0) {
                System.out.println("Sorry, " + this.getName() + " is out of stock! It's removed from your shopping cart.");
            }
            observer.update(stock);
        }
    }

    public void updateStock(int stock) {
        this.stock = stock;
        stockChanged();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
