package lesson3.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        // with string
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello World!"));
        // with integer
        Function<Integer, Integer> multiplyByTwo = i -> i * 2;
        System.out.println(multiplyByTwo.apply(5));
        // with List of strings
        List<String> strList = List.of("hello", "world", "java");
        Function<String, Integer> lenghtofseveral = str -> str.length();
        List<Integer> newList = mapList(strList, lenghtofseveral);
        System.out.println(newList);
    }

    private static <T,R> List<R> mapList(List<T> strList, Function<T, R> lenghtofseveral) {
        List<R> newList = new ArrayList<>();
        for(T s : strList){
            newList.add(lenghtofseveral.apply(s));
        }
        return newList;
    }
}
