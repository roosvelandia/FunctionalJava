package lesson7.CreationalPattern.FluentInterfaces;

import lesson6.Techniques.Composition.Function;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order() {
    }

    public void add(String item) {
        cart.add(item);
        System.out.println(item + " added to the cart");
    }

    public Order addChain(String item) {
        cart.add(item);
        System.out.println(item + " added to the cart chaining");
        return new Order(this.cart, this.address);
    }

    public void deliverAt(String location) {
        this.address = location;
        System.out.println("The delivery address set by you is '" + location + "'");
    }

    public Order deliverAtChain(String location) {
        this.address = location;
        System.out.println("Chain The delivery address set by you is '" + location + "'");
        return new Order(this.cart, this.address);
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("The items in the cart are: " + cart);
        System.out.println("The delivery address is: " + address);
    }

    public static void placeOrderStatic(Function<Order, Order> function) {

        Order myOrder = new Order();
        myOrder = function.apply(myOrder);

        System.out.println("Order placed successfully!");
        System.out.println("The items in the cart are: " + myOrder.cart);
        System.out.println("The delivery address is: " + myOrder.address);
    }
}
