package lesson5;

import java.util.Optional;

public class Operators2 {
    public static void main(String[] args) {
        // ifPresent
        Optional<String> optional = Optional.of("Hello");
        Optional<String> optionalEmpty = Optional.empty();
        optional.ifPresent(val ->System.out.println("the value is " + val));
        optionalEmpty.ifPresent(System.out::println);

        // ifPresentOrElse
        optional.ifPresentOrElse(val -> System.out.println("the value or else is " + val), () -> System.out.println("No value"));
        optionalEmpty.ifPresentOrElse(val -> System.out.println("the value or else is " + val), () -> System.out.println("No value"));
        // stream
        optional.stream().forEach(System.out::println);
        optionalEmpty.stream().forEach(System.out::println);

        // or
        Optional<String> or = optional.or(() -> Optional.of("No value"));
        Optional<String> orEmpty = optionalEmpty.or(() -> Optional.of("No value empty or"));
        System.out.println(or);
        System.out.println(orEmpty);

        // equals
        System.out.println(optional.equals(Optional.of("Hello")));
        System.out.println(optionalEmpty.equals(Optional.of("Hello")));
        System.out.println(optionalEmpty.equals(Optional.empty()));

        // hashCode
        System.out.println(optional.hashCode());
        System.out.println(optionalEmpty.hashCode());

    }
}
