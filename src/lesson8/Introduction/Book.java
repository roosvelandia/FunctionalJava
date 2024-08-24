package lesson8.Introduction;

public class Book {

    private String name;
    private String author;
    private String genre;
    private double rating;

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
}
