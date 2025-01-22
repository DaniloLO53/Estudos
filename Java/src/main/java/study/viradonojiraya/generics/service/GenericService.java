package study.viradonojiraya.generics.service;

import java.util.ArrayList;
import java.util.List;

public class GenericService<T> {
    private List<T> availableProducts;

    public GenericService(List<T> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public T findAvailableProduct() {
        System.out.println("Searching for available cars...");
        T product = availableProducts.remove(0);
        System.out.println("Car found: " + product);
        System.out.println("Available products:");
        System.out.println(availableProducts);
        return product;
    }

    public void returnRentedProduct(T product) {
        System.out.println("Returning product: " + product);
        availableProducts.add(product);
        System.out.println("Available products:");
        System.out.println(availableProducts);
    }
}
