package ru.geekbrains.lesson1;

public class PackOfChips extends Product {
    private String flavour; // вкус

    public PackOfChips(String name, String brand, double price, int stock, String flavour) {
        super(name, brand, price, stock);
        this.flavour = flavour;
    }

    public double getFlavour() {
        return flavour;
    }

    @Override
    public String displayInfo() {
        return String.format("[Пачка чипсов] %s - %s - %.2f [%s] - вкус: %s", name, brand, price, stock, flavour);
    }

}
