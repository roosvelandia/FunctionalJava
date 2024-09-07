package lesson14.observerdesign;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary("Miserables","Novel", "Victor Hugo", 1862, "SoldOut");
        EndUser endUser1 = new EndUser("Alice", bookLibrary);
        EndUser endUser2 = new EndUser("Bob", bookLibrary);

        System.out.println(bookLibrary.getInStock());

        bookLibrary.setInStock("In Stock");
    }
}
