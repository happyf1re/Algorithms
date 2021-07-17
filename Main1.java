package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main1 {


    //1. Написать программу по возведению числа в степень с помощью рекурсии.
    private static int exponentiation(int number, int exp)
    {
        if (exp != 0)
            return (number*exponentiation(number, exp-1));
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(exponentiation(3,4));

        List<Backpack.Item> items = new ArrayList<>();
        items.add(new Backpack.Item("Doll", 1, 600));
        items.add(new Backpack.Item("Kid", 10, 5));
        items.add(new Backpack.Item("Gold", 4, 10000));
        items.add(new Backpack.Item("Computer", 2, 6000));


        Backpack backpack = new Backpack(10);
        backpack.makeAllSets(items);
        System.out.println(items);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(backpack.getBestItems());

    }

}
