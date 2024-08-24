package lesson6.Techniques.Composition;

public class FunctionalComposition {

    public static void main(String[] args) {

        Function<Square,Integer> func1 = square -> square.getArea();
        Function<Integer, Double> func2 = a -> Math.sqrt(a);

        Function<Square, Double> getAreaAndSqrt = func2.compose(func1);

        Square square = new Square();
        square.setArea(100);

        Double side = getAreaAndSqrt.apply(square);

        System.out.println(side);

    }
}
