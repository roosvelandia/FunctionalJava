package lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src/lesson9/book.txt");

        try(Stream<String> books =  Files.lines(path)){
            Spliterator<String> baseSpliterator = books.spliterator();
            Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);

            Stream<Book> bookStream = StreamSupport.stream(bookSpliterator, true);
            bookStream.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
