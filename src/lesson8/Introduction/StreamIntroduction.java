package lesson8.Introduction;

import java.util.ArrayList;
import java.util.List;

public class StreamIntroduction {

    public static void main(String[] args) {
        //OOP
        List<Book> books =  new ArrayList<>();

        books.add(new Book(4.5, "Horror", "Stephen King", "It"));
        books.add(new Book(4.8, "Horror", "Stephen King", "The Shining"));
        books.add(new Book(4.2, "Horror", "Stephen King", "Carrie"));
        books.add(new Book(4.6, "Horror", "Stephen King", "Misery"));
        books.add(new Book(4.7, "Horror", "Stephen King", "Pet Sematary"));
        books.add(new Book(4.9, "Romance", "Stephen King", "The Stand"));

        List<Book> horrorBooks =  new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equals("Horror") && book.getRating() > 4.5) {
                horrorBooks.add(book);
            }
        }

        // with streams

        List<Book> horrorBooksStream = books.parallelStream() // source
                .filter(book -> book.getGenre().equals("Horror")) // intermediate operation
                .filter(book -> book.getRating() > 4.5) // intermediate operation
                .toList(); // terminal operation

        horrorBooksStream.forEach(book -> System.out.println(book.toString()));

        List<Book> romanticBooksStream = books.parallelStream() // source
                .filter(book -> book.getGenre().equals("Romance")) // intermediate operation
                .filter(book -> book.getRating() > 4.5) // intermediate operation
                .toList(); // terminal operation

        romanticBooksStream.forEach(book -> System.out.println(book.toString()));




    }



}
