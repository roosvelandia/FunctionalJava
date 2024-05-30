package lesson6.concepts;

public class ImpureFunction {
    public int value = 0;

    public int sum(int a) {
        value += a;
        return value;
    }

}
