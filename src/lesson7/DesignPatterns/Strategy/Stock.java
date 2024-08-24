package lesson7.DesignPatterns.Strategy;

public class Stock {

    private String symbol;
    private double price;
    private int units;

    public Stock(String symbol, double price, int units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    public double getPrice() {
        return price;
    }

    public int getUnits() {
        return units;
    }

    public String getSymbol() {
        return symbol;
    }

    public double calculateValue() {
        return price * units;
    }
}
