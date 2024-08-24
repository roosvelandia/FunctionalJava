package lesson8.Types;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {

    public static void main(String[] args) {

        // Stream on a collection
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();

        // Stream on a ma
        Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three",4, "four", 5, "five");
        Stream<Map.Entry<Integer,String>> entries =map.entrySet().stream();
        Stream<String> values = map.values().stream();
        Stream<Integer> keys = map.keySet().stream();

        // with stream class of()

        Stream<String> stringStream = Stream.of("one", "two", "three", "four", "five");

        // stream of Array class
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> arreyOfInteger =  Arrays.stream(integerArray);
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream arrayOfInt = Arrays.stream(intArray);

        // builder of Stream class

        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        builder.add(2);
        if(1>0){
            builder.add(3);
        } else {
            builder.add(4);
        }
        builder.add(5);
        Stream<Integer> builtStream = builder.build();
        System.out.println(builtStream.count());



    }
}
