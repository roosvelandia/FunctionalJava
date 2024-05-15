package lesson3.bifunction;

import java.util.function.BiFunction;

public class BifunctionPractice {
    public static void main(String[] args) {
        // with string
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("Hello ", "World!"));
        // with integer
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10));

        // with String and integer
        BiFunction<String, Integer, Integer> addString = (a, b) -> a.length() + b;
        System.out.println(addString.apply("sdf", 10));
    }
}
