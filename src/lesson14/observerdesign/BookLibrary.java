package lesson14.observerdesign;

import java.util.ArrayList;

public class BookLibrary implements SubjectLibrary {
    private String bookName;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<ObserverLibrary> observerList = new ArrayList<ObserverLibrary>();

    public BookLibrary(String bookName, String type, String author, double price, String inStock) {
        this.bookName = bookName;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }
    @Override
    public void subscribeObserver(ObserverLibrary observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribeObserver(ObserverLibrary observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println(
                "Book Name: " + this.bookName + ", Type: " + this.type + ", Author: " + this.author + ", Price: "
                        + this.price + ", In Stock: " + this.inStock);

        for (ObserverLibrary observer : observerList) {
            observer.update(this.bookName);
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from soldout to back in stock");
        notifyObserver();
    }

    public ArrayList<ObserverLibrary> getObserverList() {
        return observerList;
    }

    public void setObserverList(ArrayList<ObserverLibrary> observerList) {
        this.observerList = observerList;
    }
}
