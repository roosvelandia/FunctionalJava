package lesson8.Types;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {
        // iterate Object
        Stream.iterate(0, i -> i + 1);

        // iterate primitive
        IntStream.iterate(5, i -> i - 1)
                .limit(5)
                .forEach(System.out::println);

        // generate
        Stream.generate(() -> "Hello")
                .limit(5)
                .forEach(System.out::println);

        // generate random takes a supplier
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
