package lesson1.lambda;

import lesson1.functionalInterface.MyFunctionalInterface;

public class LambdaUnderTheHood {
    public static void main(String[] args) {


// this implementation generates problems and duplicates code and files.
        MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Not good Implementation 1!");
            }
        };

        MyFunctionalInterface myFunctionalInterface2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Not good Implementation 2!");
            }
        };

        MyFunctionalInterface myFunctionalInterface3 = () -> System.out.println("Correct Implementation 3!");

        myFunctionalInterface1.myMethod();
        myFunctionalInterface2.myMethod();
        myFunctionalInterface3.myMethod();
    }
}