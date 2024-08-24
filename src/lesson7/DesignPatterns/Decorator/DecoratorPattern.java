package lesson7.DesignPatterns.Decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        Burger myOrder1 = new BurgerShop(Burger::addCheese).use(new Burger());
        System.out.println("i get a " + myOrder1.getBurgerType());
        Burger myOrder2 = new BurgerShop(Burger::addVeggies).use(new Burger());
        System.out.println("i get a " + myOrder2.getBurgerType());

        Burger myOrder3 = new BurgerShop(Burger::addCheese).use(new BurgerShop(Burger::addVeggies).use(new Burger()));
        System.out.println("i get a " + myOrder3.getBurgerType());
    }

}