package lesson2.fourthUseCase;

import lesson2.thirdUseCase.StrLenght;

public class MultipleUses {
    public static void main(String[] args) {
        // traditional
        int x = printStringAndCount("Hello");
        System.out.println("traditional operation " + x);

        StrLenght strLenght = s -> {
            System.out.println("Lambda operation " + s.length());
            return s.length();
        };
        strLenght.length("Hello");
    }

    private static int printStringAndCount(String s) {
        System.out.println(s);
        return s.length();
    }
}
