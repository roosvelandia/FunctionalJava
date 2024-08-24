package lesson6.Techniques.Chaining;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer2 = s -> System.out.println("Hello " + s);

        consumer.accept("c1");
        consumer2.accept("c2");

        // same result as above

        Consumer<String> consumer3 = s -> {
            consumer.accept(s);
            consumer2.accept(s);
        };

        consumer3.accept("c3");

        // same result as above

        Consumer<String> consumer4 = consumer.thenAccept(consumer2);
        consumer4.accept("c4");

        // using Funcion interface
        Function<Integer,Integer> f1 = x -> x + 2;
        Function<Integer,Integer> f2 = x -> x * 2;
        Function<Integer,Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));

        // null pointer exception
        Consumer<String> consumer5 = consumer.thenAccept(null);

    }
}
