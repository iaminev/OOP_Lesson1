package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

        public static void main(String[] args) {

                // Product product1 = new Product();
                // product1.name = "Product1";
                // product1.brand = "Brand1";
                // product1.price = 200;
                // System.out.println(product1.displayInfo());

                /*
                 * Product product2 = new Product(null, "Brand2", 300);
                 * System.out.println(product2.displayInfo());
                 * product2.setPrice(400);
                 * double price = product2.getPrice();
                 * System.out.println(price);
                 * System.out.println(product2.displayInfo());
                 */

                // Product product3 = new Product("Product3");
                // product3.price = -100;
                // product3.name = "A";
                // System.out.println(product3.displayInfo());

                Product bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 10, 1.5, 15);
                // System.out.println(bottleOfMilk1.displayInfo());

                Product bottleOfWater1 = new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 15, 1);
                // System.out.println(bottleOfWater1.displayInfo());

                Product bottleOfWater2 = new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 20, 1.5);
                Product bottleOfWater3 = new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 25, 2);

                Product packOfChips1 = new PackOfChips("Чипсы", "Лейз", 150, 10, "Зеленый лук");
                Product packOfChips2 = new PackOfChips("Чипсы", "Принглс", 200, 28, "Острый перец");

                List<Product> products = new ArrayList<>();
                products.add(bottleOfMilk1);
                products.add(bottleOfWater1);
                products.add(bottleOfWater2);
                products.add(bottleOfWater3);
                products.add(packOfChips1);
                products.add(packOfChips2);

                VendingMachine vendingMachine = new VendingMachine(products);
                vendingMachine.showProducts();

                vendingMachine.sellProduct(vendingMachine.getBottleOfWater("Бутылка c водой", 1.5));
                vendingMachine.sellProduct(vendingMachine.getProduct(0));
                vendingMachine.sellProduct(vendingMachine.getProduct(4));
                vendingMachine.sellProduct(vendingMachine.getProduct(4));
                vendingMachine.sellProduct(vendingMachine.getProduct(11));

                System.out.println(vendingMachine.displayInfo());

                // System.out.println(vendingMachine.displayInfo());
                /*
                 * BottleOfWater bottleOfWater =
                 * vendingMachine.getBottleOfWater("Бутылка c водой", 1.5);
                 * if (bottleOfWater != null) {
                 * System.out.println("Вы получили: ");
                 * System.out.println(bottleOfWater.displayInfo());
                 * } else {
                 * System.out.println("Такой бутылки с водой нет в автомате.");
                 * }
                 */

        }

}
