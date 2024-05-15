package lesson3.unaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        // with string
        UnaryOperator<String> stringUnaryOperator = s -> s.substring(1,5);
        System.out.println(stringUnaryOperator.apply("Hello World!"));
        // with integer
        UnaryOperator<Integer> integerUnaryOperator = i -> i * i;
        System.out.println(integerUnaryOperator.apply(5));
        // with list integer
        List<Integer> intList = List.of(1,4,6,7,8);
        UnaryOperator<Integer> multiplyUnaryOperator = i -> i * 100;
        List<Integer> result = mapper(intList, multiplyUnaryOperator);
        System.out.println(result);
    }

    private static <T> List<T> mapper(List<T> intList, UnaryOperator<T> multiplyUnaryOperator) {
        List<T> result = new ArrayList<>();
        for(T i : intList){
            result.add(multiplyUnaryOperator.apply(i));
        }
        return result ;
    }
}
