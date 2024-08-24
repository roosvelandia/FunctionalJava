package lesson8.Operations;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatOrMap {

        public static void main(String[] args) {
            Stream<String> streama = Stream.of("Hello", "there");
            Stream<String> streamb = Stream.of("Learn", "functional");

            // approach  not recommended at all!
            Stream<Stream<String>> streamc = Stream.of(streama, streamb);

            // flatMap
            Stream.of(streama, streamb)
                    .flatMap(s -> s)
                    .forEach(System.out::println);

            // reading file

            Path path = Path.of("src/lesson8/Operations/notebook.txt");

            try (Stream<String> notebook = java.nio.file.Files.lines(path);) {

                List<String> collect = notebook
                        .flatMap(line -> Arrays.stream(line.split(" ")))
                        .toList();
                collect.forEach(System.out::println);

            } catch (java.io.IOException e) {
                e.printStackTrace();
            }

        }

}
