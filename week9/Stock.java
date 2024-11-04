package test11;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0.0; // Default value
        this.currentPrice = 0.0; // Default value
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0;
        }
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}