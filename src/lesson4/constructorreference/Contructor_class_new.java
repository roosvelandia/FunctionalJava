package lesson4.constructorreference;

import java.util.function.Function;

public class Contructor_class_new {
    public static void main(String[] args) {
        Function<Runnable,Thread> threadGenerator = Thread::new;
        Runnable task = () -> System.out.println("Thread executed with lambda");
        Runnable task2 = () -> System.out.println("Thread executed with lambda 2");
        Thread thread1 = threadGenerator.apply(task);
        Thread thread2 = threadGenerator.apply(task2);
        thread1.start();
        thread2.start();

        threadGenerator.apply( () -> System.out.println("Thread executed with lambda 3")).start();
    }
}
