package lesson4.methodreference.object_instancemethod;

import java.util.List;
import java.util.function.Consumer;

public class MethodReferencePractice {
    public static void main(String[] args) {
        List<Integer> intList = List.of(34,67,8,23,67,89,90);

        // with integers
        Consumer<Integer> consumer = System.out::println;

        consumer.accept(56);

        printList(intList, consumer);

        // with strings

        List<String> strList = List.of("hello", "i'm", "MELI");

        Consumer<String> consumerString = System.out::println;

        consumerString.accept("test");

        printList(strList, consumerString);
    }

    private static <T> void printList(List<T> intList, Consumer<T> consumer) {
        for(T i : intList){
            consumer.accept(i);
        }
    }
}
