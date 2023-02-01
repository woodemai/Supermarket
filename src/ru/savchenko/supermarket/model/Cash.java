package ru.savchenko.supermarket.model;

public class Cash {
    private final int value;
    private int amount;

    public Cash(int value) {
        this.value = value;
        amount = 0;
    }

    public int getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }
    private void addMoney(int addingMoneyAmount) {
        amount += addingMoneyAmount;
    }
    private boolean removeMoney(int removingMoneyAmount) {
        if (removingMoneyAmount > amount) {
            return false;
        }else {
            amount -= removingMoneyAmount;
        }
        return true;    }
}
