package lesson8.Operations;

import java.util.stream.Stream;

public class FilterOperation {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        filterOperation(stream);
    }


    public static void filterOperation(Stream<Integer> stream) {
        stream.filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
