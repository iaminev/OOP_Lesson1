package ru.geekbrains.lesson1;

public class BottleOfWater extends Product {

    private double volume; // Объем

    public BottleOfWater(String name, String brand, double price, int stock, double volume) {
        super(name, brand, price, stock);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f [%s] - объем: %.2f", name, brand, price, stock, volume);
    }
}
