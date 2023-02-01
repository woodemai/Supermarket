package ru.savchenko.supermarket.model;

import java.util.ArrayList;
import java.util.List;
public class Storage {
    private final List<Product> productList;

    public Storage() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    private void addProducts(List<Product> addingProducts) {
        productList.addAll(addingProducts);
    }
    private void removeProducts(List<Product> removableProducts) {
        productList.removeAll(removableProducts);
    }
}
