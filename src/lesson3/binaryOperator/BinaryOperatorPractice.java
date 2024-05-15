package lesson3.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        // with string
        BinaryOperator<String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("Hello ", "World!"));
        // with integer
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10));
    }
}
