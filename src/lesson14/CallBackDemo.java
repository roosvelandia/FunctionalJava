package lesson14;

public class CallBackDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is running Start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                new CallBackDemo().runningAsync(new CallBack() {
                    @Override
                    public void call() {
                        System.out.println("CallBack is called");
                    }
                });

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(2000);
        System.out.println("Main thread completed End");
    }

    public void runningAsync(CallBack callBack) {
        System.out.println("runningAsync in a separate thread Start");
        sleep();
        System.out.println("runningAsync in a separate thread End");
        callBack.call();
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
