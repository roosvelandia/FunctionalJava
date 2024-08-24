package lesson8.Types;

import lesson8.Introduction.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStream {

    public static void main(String[] args) {
        List<Book> books =  new ArrayList<>();

        books.add(new Book(4.5, "Horror", "Stephen King", "It"));
        books.add(new Book(4.8, "Horror", "Stephen King", "The Shining"));
        books.add(new Book(4.2, "Horror", "Stephen King", "Carrie"));
        books.add(new Book(4.6, "Horror", "Stephen King", "Misery"));
        books.add(new Book(4.7, "Horror", "Stephen King", "Pet Sematary"));
        books.add(new Book(4.9, "Romance", "Stephen King", "The Stand"));

       OptionalDouble avg = books.stream()
               .mapToDouble(Book::getRating)
                .average();

       // map returns  Object
         // mapToDouble returns DoubleStream primitive double
        System.out.println(avg.getAsDouble());

        // getting primitives
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);

        // converting primitives to objects
        Stream<Integer> streamInt = intStream.boxed();
        Stream<Double> streamDouble = doubleStream.mapToObj(Double::valueOf);
        Stream<Long> streamLong = longStream.boxed();
    }
}
