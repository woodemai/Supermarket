package ru.savchenko.supermarket.model;

public class Checkout {
    Cash cash;
    Employee employee;

    public Cash getCash() {
        return cash;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Checkout(Cash cash, Employee employee) {
        this.cash = cash;
        this.employee = employee;
    }
}
