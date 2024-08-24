package lesson7.DesignPatterns.Decorator;

public class Burger {
    public String getBurgerType() {
        return burgerType;
    }

    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }
    public Burger(String type) {
        this.burgerType = type;
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType += "Cheese ");
    }

    public Burger addVeggies() {
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType += "Veggies ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
