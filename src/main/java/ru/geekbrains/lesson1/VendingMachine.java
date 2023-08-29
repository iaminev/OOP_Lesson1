package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;
    protected double balance; // Баланс

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Product getProduct(int position) {

        if (position >= 0 && position <= products.size()) {
            return products.get(position);

        } else {
            return null;
        }

    }

    public void sellProduct(Product product) {
        if (products.contains(product)) {
            if (product.getStock() > 0) {
                product.setStock(product.getStock() - 1);
                this.balance += product.getPrice();
                System.out.println("Продажа: " + product.getName());

            }
        } else {
            System.out.println("не удалось найти продукт.");
        }

    }

    public String displayInfo() {
        int totalAmount = 0;
        double totalValue = 0.0;

        for (Product product : products) {
            totalAmount += product.stock;
            totalValue += product.stock * product.price;
        }

        return String.format("Total stocks: %s; total value: %.2f; total balance:  %.2f", totalAmount, totalValue,
                balance);
    }

    public void showProducts() {

        int counter = 0;
        for (Product product : products) {
            System.out.println("" + Integer.toString(counter) + ": " + product.displayInfo());
            counter += 1;
        }
        System.out.println(this.displayInfo());

    }

}
