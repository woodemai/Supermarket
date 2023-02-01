package ru.savchenko.supermarket.model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<TradingPosition> tradingPositions;

    public Shelf(List<TradingPosition> tradingPositions) {
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
