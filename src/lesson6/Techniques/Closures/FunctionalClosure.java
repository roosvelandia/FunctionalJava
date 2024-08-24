package lesson6.Techniques.Closures;

public class FunctionalClosure {

    public static void main(String[] args) {
        int value = 111;// Error: Cannot reference a field before it is defined

        Task lambdaTask = () -> {
            System.out.println(value);
            System.out.println("Task completed ");
        };

        printValue(lambdaTask);
    }

    private static void printValue(Task lambdaTask) {
        lambdaTask.doTask();
    }


}
