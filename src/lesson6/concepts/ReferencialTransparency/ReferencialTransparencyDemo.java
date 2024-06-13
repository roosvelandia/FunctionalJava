package lesson6.concepts.ReferencialTransparency;

public class ReferencialTransparencyDemo {
    public static void main(String[] args) {
        int result = add(2, multiply(2,4));
        System.out.println(result);
        int result2 = add(2, 8);
        System.out.println(result2);
        int result3 = add(2, multiply(2,multiply(2,2)));
        System.out.println(result3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
