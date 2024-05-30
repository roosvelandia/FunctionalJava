package lesson6.concepts;

public class Demo {

    public static void main(String[] args) {
        int x = sum(multiply(1, 2), multiply(3, 4));
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // this is not a pure function becuase printing to the console
    public static int multiply(int a, int b) {
        log(String.format("Multiplying %s the result of %s y %s", a*b,a,b));
        return a * b;
    }

    // this is not a pure function because it has no return value and also prints to the console
    public static void log (String message) {
        System.out.println("Logging: " + message);
    }
}
