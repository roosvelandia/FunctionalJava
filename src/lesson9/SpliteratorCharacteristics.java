package lesson9;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorCharacteristics {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(0);
        numbers.add(1);

        Stream<Integer> streamNumbers = numbers.stream();
        Spliterator<Integer> spliterator = streamNumbers.spliterator();
        int bits = spliterator.characteristics();
        System.out.println("ORDERED: " + (Integer.bitCount(bits)));
        // OR
        System.out.println(Integer.bitCount(bits | 0x00000010 ));
        // AND
        System.out.println(Integer.bitCount(bits & 0x00000010 ));
        //HAS
        System.out.println(spliterator.hasCharacteristics(Spliterator.ORDERED));


    }
}
