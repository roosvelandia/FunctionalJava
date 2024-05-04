package lesson1.imperativeVSDeclarative;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    public static void main(String[] args) {
        // Imperative
        long startTimeI = System.nanoTime();
        int sumOfEvens = 0;
        for (int i = 0; i <= 100 ; i++) {
            if(i%2 ==0){
                sumOfEvens += i;
            }
        }
        long endTimeI = System.nanoTime() - startTimeI;
        System.out.println("With imperative sum is = " + sumOfEvens + " finished in " + endTimeI + "MS");

        // declarative
        long startTimeD = System.nanoTime();
        int sumOfEvents2 = IntStream.rangeClosed(0,100)
                .filter(i -> i % 2 ==0)
                .reduce((x,y) -> x+y)
                .getAsInt();
        long endTimeD = System.nanoTime() - startTimeD;
        System.out.println("With declarative sum is = " + sumOfEvents2 + " finished in " + endTimeD + "MS");
    }
}
