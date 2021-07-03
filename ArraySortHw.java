package hw;

import lesson2.MyArrayList;

import java.util.Arrays;
import java.util.Random;

public class ArraySortHw {
    public static void main(String[] args) {
        //1. Создать массив большого размера (100000 элементов).
        int[] arr = new int[100000];
        //2. Заполнить массив случайными числами.
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        //3. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
        long m = System.currentTimeMillis();
        arrayBubble(arr);
        System.out.println((double) m - System.currentTimeMillis());

        arraySelection(arr);
        System.out.println((double) m - System.currentTimeMillis());

        arrayInsertion(arr);
        System.out.println((double) m - System.currentTimeMillis());




    }

    private static void arrayBubble(int[] array) {
        boolean end = true;
        while (end) {
            end = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    end = true;
                }
            }
        }
    }

    private static void arraySelection(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }

    private static void swap(int[] array, int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }

    private static void arrayInsertion(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}
