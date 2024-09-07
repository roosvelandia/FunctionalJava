package lesson14.pullpush;

public class PushCallBackDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is running Start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                new PushCallBackDemo().runningAsync(new PushCallBack() {

                    @Override
                    public void pushComplete() {
                        System.out.println("Callback Done");
                    }

                    @Override
                    public void pushData(String data) {
                        System.out.println("Callback Data" + data);
                    }

                    @Override
                    public void pushError(Exception e) {
                        System.out.println("Callback Error" + e);
                    }
                });

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(2000);
        System.out.println("Main thread completed End");
    }

    public void runningAsync(PushCallBack pushCallBack) {
        System.out.println("runningAsync in a separate thread Start");
        sleep();
        System.out.println("runningAsync in a separate thread End");
        pushCallBack.pushData("Data1");
        pushCallBack.pushData("Data2");
        pushCallBack.pushData("Data3");

        pushCallBack.pushError(new RuntimeException("Exception for threads"));
        pushCallBack.pushComplete();
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
