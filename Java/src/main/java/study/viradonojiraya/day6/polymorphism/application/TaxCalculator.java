package study.viradonojiraya.day6.polymorphism.application;

import study.viradonojiraya.day6.polymorphism.domain.Product;
import study.viradonojiraya.day6.polymorphism.domain.Tomato;

public class TaxCalculator {
    public static void calculateProductTax(Product product) {
        System.out.println("Product's name: " + product.getName());
        System.out.println("Product's price: " + product.getPrice());
        System.out.println("Product's tax value: " + product.calculateTax());

        if (product instanceof Tomato) {
            // narrowing casting
            Tomato tomato1 = (Tomato) product;
            System.out.println("Expiration date: " + tomato1.getExpirationDate());
        }
    }
}
