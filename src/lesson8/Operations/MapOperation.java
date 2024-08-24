package lesson8.Operations;

import lesson8.Introduction.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapOperation {
    public static void main(String[] args) {
         Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        mapOperation(stream);

        List<Book> books =  new ArrayList<>();

        books.add(new Book(4.5, "Horror", "Stephen King", "It"));
        books.add(new Book(4.8, "Horror", "Stephen King", "The Shining"));
        books.add(new Book(4.2, "Horror", "Stephen King", "Carrie"));
        books.add(new Book(4.6, "Horror", "Stephen King", "Misery"));
        books.add(new Book(4.7, "Horror", "Stephen King", "Pet Sematary"));
        books.add(new Book(4.9, "Romance", "Stephen King", "The Stand"));

        // from books, bring only titles of horror books with rating > 4.5
        books.parallelStream() // source
                .filter(book -> book.getGenre().equals("Horror")) // intermediate operation
                .filter(book -> book.getRating() > 4.5) // intermediate operation
                .map(Book::getName)
                .forEach(System.out::println);

    }

    public static void mapOperation(Stream<Integer> stream) {
        stream.map(number -> number * 2)
                 .forEach(System.out::println);
     }
}
