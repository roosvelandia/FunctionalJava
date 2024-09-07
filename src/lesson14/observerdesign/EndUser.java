package lesson14.observerdesign;

public class EndUser implements ObserverLibrary {

    String name;

    EndUser(String name, SubjectLibrary subject) {
        this.name = name;
        subject.subscribeObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookName) {
        System.out.println("Hello " + name + "! New book has been added to the library: " + bookName);
    }
}
