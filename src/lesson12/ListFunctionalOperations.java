package lesson12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListFunctionalOperations {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("The Godfather", 1972, "Hollywood"),
                new Movie("The Shawshank Redemption", 1994, "Hollywood"),
                new Movie("The Godfather II", 1974, "Hollywood"),
                new Movie("The Dark Knight", 2008, "Hollywood"),
                new Movie("12 Angry", 1957, "Hollywood"));

        //Traversal
        System.out.println("________Traversal________");
        movies.forEach(System.out::println);
        //Sorting
        System.out.println("_______Sorting_________");
        movies.sort((p1,p2)->p2.getReleaseYear()-p1.getReleaseYear());
        movies.forEach(System.out::println);
        //Filtering
        System.out.println("_______Filtering_________");
        movies.stream()
                .filter(m->m.getReleaseYear()>2000)
                .forEach(System.out::println);
        //Mapping
        System.out.println("_______Mapping_________");
        movies.stream()
                .map(Movie::getName)
                .forEach(System.out::println);
        //Reduce
        System.out.println("_______Reduce_________");
        movies.stream()
                .map(Movie::getName)
                .reduce((m1,m2)->m1+" | "+m2)
                .ifPresent(System.out::println);
    }
}
