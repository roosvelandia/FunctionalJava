package lesson13.queue;

public class QueueDemo {
    public static void main(String[] args) {
        QueueFun<String> queue = QueueFun.queue();
        queue = queue.enqueue("1");
        queue = queue.enqueue("2");
        queue = queue.enqueue("3");
        queue.forEach(System.out::println);
        System.out.println("Size: "+queue.size());
        System.out.println("Peek: "+queue.peek());
        queue = queue.dequeue();
        queue.forEach(System.out::println);
        System.out.println("Size: "+queue.size());
        System.out.println("Peek: "+queue.peek());
        queue.dequeue().forEach(System.out::println);
    }
}
