package lesson7.DesignPatterns.Decorator;

import lesson6.Techniques.Composition.Function;

public class BurgerShop {

    Function<Burger, Burger> addDecoration;

    public BurgerShop (Function<Burger, Burger> addDecoration) {
        this.addDecoration = addDecoration;
    }

    public Burger use (Burger baseBurger) {
        System.out.println("base burger" + baseBurger);
        return addDecoration.apply(baseBurger);
    }

}
