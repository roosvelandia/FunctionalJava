package lesson5;

import java.util.Optional;

public class GetValuesBack {

    public static void main(String[] args) {
        Integer x = 10;
        // get
        Optional<Integer> optional = Optional.of(x);
        System.out.println(optional.get());
        // emptyOptional
        Optional<Integer> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        // isPresent
        System.out.println(emptyOptional.isPresent() ? emptyOptional.get(): 11);
        // orElse
        System.out.println(emptyOptional.orElse(12));
        // orElseGet --< gets a supplier
        System.out.println(emptyOptional.orElseGet(() -> 13));
        // orElseThrow
        try {
            System.out.println(emptyOptional.orElseThrow(() -> new Exception("No value")));
        } catch (Exception e) {
            e.printStackTrace();

    }
    }
}
