package lesson8.Operations;

import lesson8.Introduction.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Laziness {

    public static void main(String[] args) {
        List<Book> books =  new ArrayList<>();

        books.add(new Book(4.5, "Horror", "Stephen King", "It"));
        books.add(new Book(4.8, "Horror", "Stephen King", "The Shining"));
        books.add(new Book(4.2, "Horror", "Stephen King", "Carrie"));
        books.add(new Book(4.6, "Horror", "Stephen King", "Misery"));
        books.add(new Book(4.7, "Horror", "Stephen King", "Pet Sematary"));
        books.add(new Book(4.9, "Romance", "Stephen King", "The Stand"));

        // laziness
        Stream<Book> stream = books.parallelStream()
                .filter(book -> book.getGenre().equals("Horror"))
                .peek(book -> System.out.println("Filtering horror books: " + book))
                .filter(book -> book.getRating() > 4.5) ;
//this prints first than the stream because it's only when is used the terminal operation that the stream is executed
        System.out.println("Filter done");
        collectBooks(stream);
    }

    private static void collectBooks(Stream<Book> stream) {

        List<Book> pupularBooks = stream.toList();
        System.out.println("Collect done");
        pupularBooks.forEach(System.out::println);
    }


}
