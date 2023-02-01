package ru.savchenko.supermarket.model;

public class Product {
    private final String name;
    private final int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
