package lesson7.CreationalPattern.FluentInterfaces;

public class FluentShopping {

    public static void main(String[] args) {
        Order myOrder = new Order();
        // first approach
        myOrder.add("Shoes");
        myOrder.add("Headphones");
        myOrder.deliverAt("Street no 45, Jodhpur");
        myOrder.placeOrder();
        // second approach
        System.out.println("------------------------------");
        new Order()
                .addChain("Mobile")
                .addChain("Laptop")
                .deliverAtChain("Sector 45, Gurgaon")
                .placeOrder();
        // third approach
        System.out.println("------------------------------");
        Order
                .placeOrderStatic(order ->
                        order
                        .addChain("Shirt")
                        .addChain("Trousers")
                        .deliverAtChain("Sector 45, Gurgaon"));
    }
}
