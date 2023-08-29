package ru.geekbrains.lesson1;

public class BottleOfMilk extends Product {

    private double volume; // Объем
    private int fat; // Содержание жирности

    public BottleOfMilk(String name, String brand, double price, int stock, double volume, int fat) {
        super(name, brand, price, stock);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f [%s] - объем: %.2f жирность: %d", name, brand, price,
                stock, volume, fat);
    }

}
