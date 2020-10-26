package com.isiksinan.ctis417.ShoppingCart;

public class Main {

    public static void main(String[] args) {
	// write your code here



        // Create shopping cart
        // Create customer
        Customer customer = new Customer("1", "sinan");

        // Get customer shopping cart reference
        ShoppingCart cart = customer.getCart();


        // Create order
        Order order1 =  new Order("1", customer, cart);


        // Create new product objects in runtime
        Product iphone12 = new Product("iPhone 12", 5000, 10);
        Product sunglasses = new Product("sunglasses", 300, 50);
        Product airpod = new Product("airpod", 500, 20);
        Product book = new Product("book", 50, 30 );


        // Add some products to shopping cart called cart
        cart.addProduct(iphone12);
        cart.addProduct(book);
        cart.addProduct(sunglasses);


        // Update stock for some products
        iphone12.updateStock(15);
        sunglasses.updateStock(9);

        // If stock is updated as 0, the product will be removed from the shopping cart
        // and customer will be notified with warning message.
        sunglasses.updateStock(0);

        // Customer pays with one of the payment strategy
        cart.pay(new PaypalPaymentStrategy("sinan@gmail.com", "mypwd"));


    }
}
