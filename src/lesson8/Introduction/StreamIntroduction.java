package lesson8.Introduction;

import java.util.ArrayList;
import java.util.List;

public class StreamIntroduction {

    public static void main(String[] args) {
        //OOP
        List<Book> books =  new ArrayList<>();
        List<Book> horrorBooks =  new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equals("Horror") && book.getRating() > 4.5) {
                horrorBooks.add(book);
            }
        }

        // with streams

        List<Book> horrorBooksStream = books.parallelStream()
                .filter(book -> book.getGenre().equals("Horror"))
                .filter(book -> book.getRating() > 4.5)
                .toList();

    }



}
