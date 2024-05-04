package lesson1.functional;

import lesson1.functionalInterface.MyFunctionalInterface;
import lesson1.traditional.MyRunnable;

public class LambdaExample1 {
    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("Lambda execute thread!"));
        t.start();

        // using own functional Interface
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Lambda execute a function with my own interface!");
        myFunctionalInterface.myMethod();

        // using own functional Interface with a method
        onTheFly(() -> System.out.println("Lambda execute with behaviour as parameter!"));

    }

    public static void onTheFly(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.myMethod();
    }
}
