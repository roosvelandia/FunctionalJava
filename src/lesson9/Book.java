package lesson9;

public class Book {

    private final String name;
    private final String author;
    private final String genre;
    private final double rating;

    public Book(double rating, String genre, String author, String name) {
        this.rating = rating;
        this.genre = genre;
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name= '" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
