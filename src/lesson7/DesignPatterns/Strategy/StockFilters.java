package lesson7.DesignPatterns.Strategy;

import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    public static List<Stock> bySymbol(List<Stock> list, String symbol) {
        List<Stock> filtered = new java.util.ArrayList<>(List.of());
        for (Stock stock : list) {
            if (stock.getSymbol().equals(symbol)) {
                filtered.add(stock);
            }
        }
        return filtered;
    }

    public static List<Stock> byPriceAbove(List<Stock> list, double price) {
        List<Stock> filtered = new java.util.ArrayList<>(List.of());
        for (Stock stock : list) {
            if (stock.getPrice() > price) {
                filtered.add(stock);
            }
        }
        return filtered;
    }

    public static List<Stock> byPriceBelow(List<Stock> list, double price) {
        List<Stock> filtered = new java.util.ArrayList<>(List.of());
        for (Stock stock : list) {
            if (stock.getPrice() < price) {
                filtered.add(stock);
            }
        }
        return filtered;
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> filter) {
        List<Stock> filtered = new java.util.ArrayList<>(List.of());
        for (Stock stock : list) {
            if (filter.test(stock)) {
                filtered.add(stock);
            }
        }
        return filtered;
    }


}
