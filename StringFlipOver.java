package lesson3.hw;

import lesson3.MyStack;

import java.util.Arrays;

//1. Создать программу, которая переворачивает вводимые строки (читает справа налево).

public class StringFlipOver {

    private static void flip(String str) {
        MyStack<Character> stack = new MyStack<>(str.length());
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            stack.push(c);
        }
        System.out.println(str);
//        for (int i = 0; i < charArray.length; i++) {
//            charArray[i] = stack.pop();
//        }

        //Все же не знаю, как вывести нормально без стрингбилдера
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "Hello world!";
        flip(str);
    }
}

