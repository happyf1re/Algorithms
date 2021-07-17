package lesson6;

import java.sql.SQLOutput;
import java.util.Random;

public class NewMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int quantity = 200000;
        int balance = 0;

        for (int i = 0; i < quantity; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while (map.height() < 6) {
                x = rand.nextInt(101 + 100) - 100;
                map.put(x, x);
            }
            if (map.isBalance()) {
                balance++;
            }
        }

        System.out.println("Сбалансировано: " + balance);
        System.out.println("Не сбалансировано: " + (quantity-balance));

    }
}
