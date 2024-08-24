package lesson7.DesignPatterns.Iterator;

public class IteratorPattern {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList(new Object[]{1, 2, "true", false, 5});
        myArrayList.forEach(System.out::println);
    }
}
