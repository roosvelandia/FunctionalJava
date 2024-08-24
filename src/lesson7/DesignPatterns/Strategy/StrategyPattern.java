package lesson7.DesignPatterns.Strategy;

import java.util.List;

public class StrategyPattern {
    public static void main(String[] args) {

        List<Stock> stocks = List.of(
                new Stock("AAPL", 318.65, 10),
                new Stock("MELI", 166.86, 45),
                new Stock("Google", 99, 12),
                new Stock("AMZ", 1866.74, 45),
                new Stock("GOOGL", 1480.20, 3)
        );

        System.out.println("Stocks bt store");
        StockFilters.bySymbol(stocks, "MELI").forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));
        System.out.println("Stocks priced above 100");
        StockFilters.byPriceAbove(stocks, 100).forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));
        System.out.println("Stocks priced bellow 100");
        StockFilters.byPriceBelow(stocks, 100).forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));
        System.out.println("--------------------------");
        System.out.println("Stocks bt store using filter");
        StockFilters.filter(stocks, stock -> stock.getSymbol().equals("MELI")).forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));
        System.out.println("Stocks priced above 100 using filter");
        StockFilters.filter(stocks, stock -> stock.getPrice() > 100).forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));
        System.out.println("Stocks priced bellow 100 using filter");
        StockFilters.filter(stocks, stock -> stock.getPrice() < 100).forEach(stock -> System.out.println(stock.getSymbol() + " " + stock.getPrice() + " " + stock.getUnits()));

    }
}
