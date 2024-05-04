package lesson1.traditional;

public class TraditionalRunnable {
    public static void main(String[] args) {

        // first option
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();

        // second option
        Thread t2 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread executed with anonymous class");
            }
        });
        t2.start();
    }
}
