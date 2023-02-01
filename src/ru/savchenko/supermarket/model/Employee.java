package ru.savchenko.supermarket.model;

public class Employee {
    private final String name;
    private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
