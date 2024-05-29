package lesson5;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {

        // empty
        String val = "Hello";
        Optional<String> empty = Optional.empty();
       System.out.println(empty);
       // value of
        Optional<String> of = Optional.of(val);
        System.out.println(of);
        //nullable
        Optional<String> ofNullable = Optional.ofNullable(val);
        System.out.println(ofNullable);
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println(nullable);
    }
}
