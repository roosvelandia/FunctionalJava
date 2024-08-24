package lesson7.DesignPatterns.Iterator;

import java.util.function.Consumer;

public class MyArrayList {

    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> consumer) {
        for (Object element : elements) {
            consumer.accept(element);
        }
    }
}
