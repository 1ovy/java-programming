package test11;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);

        stock.setCurrentPrice(34.35);

        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: $" + stock.previousClosingPrice);
        System.out.println("Current Price: $" + stock.currentPrice);
        System.out.printf("Change Percentage: %.2f%%\n", stock.getChangePercent());
    }
}
