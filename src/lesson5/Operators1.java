package lesson5;

import java.util.Optional;

public class Operators1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        Optional<String> optionalEmpty = Optional.empty();
        // map
        String map = optional.map(String::toUpperCase).orElse("No value");
        String mapEmpty = optionalEmpty.map(String::toUpperCase).orElse("No value map");
        System.out.println(map);
        System.out.println(mapEmpty);
        // flatMap
       String flatMap = optional.flatMap(s -> Optional.of(s.toUpperCase())).orElse("No value");
        String flatMapEmpty = optionalEmpty.flatMap(s -> Optional.of(s.toUpperCase())).orElse("No value flatMap");
        System.out.println(flatMap);
        System.out.println(flatMapEmpty);
        // filter
        String filter = optional.filter(s -> s.length() > 3).orElse("No value");
        String filterEmpty = optionalEmpty.filter(s -> s.length() > 3).orElse("No value filter");
        System.out.println(filter);
        System.out.println(filterEmpty);
    }
}
