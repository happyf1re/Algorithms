package lesson4;

import java.util.ArrayList;
import java.util.List;


//2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class Backpack {

    private List<Item> bestItems = null;

    private double maxW;//вес
    private double bestPrice; //цена

    //вычисляет общий вес
    private double calcWeight(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getWeight();
        }
        return result;
    }

    public static class Item {

        private String name;
        private double weigth;
        private double price;

        public Item(String name, double weigth, double price) {
            this.name = name;
            this.weigth = weigth;
            this.price = price;
        }

        public double getWeight() {
            return weigth;
        }

        public double getPrice() {
            return price;
        }


        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", weigth=" + weigth +
                    ", price=" + price +
                    '}';
        }
    }


    // вычисляет общую стоимость
    private double calcPrice(List<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    //проверяем решение
    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.calcWeight(items) <= this.maxW) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        } else {
            if (this.calcWeight(items) <= this.maxW && this.calcPrice(items) > this.bestPrice) {
                this.bestItems = items;
                this.bestPrice = this.calcPrice(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Backpack(double maxW) {
        this.maxW = maxW;
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }
}
