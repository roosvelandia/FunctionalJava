package lesson3.genericFunctionalInterface;

public class FunctionalGenericsDemo {
    public static void main(String[] args) {
        // lambda with strings
        FunctionalGenerics<String, String> demo = s -> s.substring(1,5);
        System.out.println(demo.execute("Hello World!"));
        // lambda with string and integer
        FunctionalGenerics<String, Integer> demo2 = s -> s.length();
        System.out.println(demo2.execute("Hello World!"));
    }
}
