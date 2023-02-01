package ru.savchenko.supermarket.model;

public class TradingPosition {
    private final Product product;
    private final int cost;

    public Product getProduct() {
        return product;
    }

    public int getCost() {
        return cost;
    }

    public TradingPosition(Product product, int cost) {
        this.product = product;
        this.cost = cost;
    }
}
