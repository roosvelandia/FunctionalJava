package lesson8.Types;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

    public static void main(String[] args) {

        // sum
        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .sum();
        System.out.println(sum);

        // max returns primitive Optionals
        OptionalInt max = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .max();
        System.out.println(max);

        OptionalInt maxEmpty = IntStream.of()
                .max();
        System.out.println(maxEmpty);

        // min returns primitive Optionals
        OptionalInt min = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .min();
        System.out.println(min);

        OptionalInt minEmpty = IntStream.of()
                .min();
        System.out.println(minEmpty);

        // average
        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .average();
        System.out.println(average);

        // summaryStatistics()
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(intStream.summaryStatistics());

    }
}
