package ru.savchenko.supermarket.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<TradingPosition> tradingPositions;

    public List<TradingPosition> getTradingPositions() {
        return tradingPositions;
    }

    public void setTradingPositions(List<TradingPosition> tradingPositions) {
        this.tradingPositions = tradingPositions;
    }

    public Cart(List<TradingPosition> tradingPositions) {
        tradingPositions = new ArrayList<>();
        this.tradingPositions = tradingPositions;
    }

    private void addPosition(TradingPosition tradingPosition) {
        tradingPositions.add(tradingPosition);
    }

    private void removePosition(TradingPosition tradingPosition) {
        tradingPositions.remove(tradingPosition);
    }
}
