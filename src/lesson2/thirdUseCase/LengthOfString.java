package lesson2.thirdUseCase;

public class LengthOfString {
    public static void main(String[] args) {
        // traditional
        System.out.println("traditional operation " + lengthOfString("Hello"));

        // with lambda
        StrLenght strLenght = s -> s.length();
        System.out.println("Lambda operation "+ strLenght.length("Hello"));

    }

    private static int lengthOfString(String s) {
        return s.length();
    }

}
