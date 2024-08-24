package lesson7.CreationalPattern.Factory;

public class FactoryMethodPattern {

    public static void main(String[] args) {

        Flooring woodenFlooring = FlooringFactory.getFlooring(-1, 10);
        woodenFlooring.installation();

        Flooring corkFlooring = FlooringFactory.getFlooring(-1, 45);
        corkFlooring.installation();

        Flooring concreteFlooring = FlooringFactory.getFlooring(10, 20);
        concreteFlooring.installation();
    }
}
