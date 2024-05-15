package lesson3.supplier;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        // with string
        Supplier<String> stringSupplier = () -> "Hello World!";
        System.out.println(stringSupplier.get());
        //with lambda
        Supplier<Double> randmoNumber = () -> Math.random();
        System.out.println(randmoNumber.get());
    }
}
