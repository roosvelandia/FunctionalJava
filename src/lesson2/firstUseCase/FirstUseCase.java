package lesson2.firstUseCase;

public class FirstUseCase {
    public static void main(String[] args) {
        // traditional way
        myName();
        // with Lambda
        Name name = () -> System.out.println("My name is with a lambda: ");
        name.myName();
    }

    private static void myName(){
        System.out.println("My name is with traditional Method: ");
    }
}
