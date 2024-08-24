package lesson6.Techniques.Currying;

import lesson6.Techniques.Composition.Function;

public class Currying {

    public static void main(String[] args) {

        /*Option 1
        Function<Integer, Function<Integer, Integer>> fun1 = u -> {
            return v -> u + v;
        };

         */

        // Option 2
        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

        Function<Integer, Integer> fun2 = fun1.apply(1);

        int result = fun2.apply(2);

        System.out.println(result);

        System.out.println(fun1.apply(3).apply(4));

        // concatenate 3 functions

        Function<Integer, Function<Integer, Function<Integer, Integer>>> fun3 = u -> v -> w -> u + v + w;

        Function<Integer, Function<Integer, Integer>> fun4 = fun3.apply(1);

        Function<Integer, Integer> fun5 = fun4.apply(2);

        int result2 = fun5.apply(3);

        System.out.println(result2);

        System.out.println(fun3.apply(4).apply(5).apply(6));

    }
}
