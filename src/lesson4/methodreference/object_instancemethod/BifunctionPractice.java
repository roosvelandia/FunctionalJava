package lesson4.methodreference.object_instancemethod;

import java.util.function.BiFunction;

public class BifunctionPractice {
    public static void main(String[] args) {
        // with string
        BiFunction<String, String, String> concat = A_Class::staticStringMethod;
        System.out.println(concat.apply("Hello ", "World!"));
        // with integer
        BiFunction<Integer, Integer, Integer> add = A_Class::staticIntMethod;
        System.out.println(add.apply(5, 10));

        // with String and integer
        BiFunction<String, Integer, String> addString = A_Class::staticMixedMethod;
        System.out.println(addString.apply("sdf", 10));
    }
}

class A_Class{
    static String staticStringMethod (String a, String b){
        return a + b;
    }

    static int staticIntMethod (int a, int b){
        return a + b;
    }

    static String staticMixedMethod (String a, int b){
        return a + b;
    }
}
