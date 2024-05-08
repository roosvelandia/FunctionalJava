package lesson2.secondUseCase;

public class Operation {
    public static void main(String[] args) {
        // traditional
        sum(1, 2);
        // with lambda sum
        MathOperation add = (a, b) -> System.out.println("Lambda operation "+ (a+b));
        add.operation(1, 2);
        // with lambda multiply
        MathOperation multiply = (a, b) -> System.out.println("Lambda operation "+ (a*b));
        multiply.operation(2, 2);

    }

    private static void sum (int a, int b){
        System.out.println("traditional operation "+ (a+b));
    }
}
