package lesson8.Reduce;

import java.util.stream.Stream;

public class ReduceOperation {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }
}
