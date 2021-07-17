package ru.geekbrains.lesson01;

import java.util.Scanner;

public class HomeWorkApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords(){
        System.out.println("_ Orange\n" +
                "_ Banana\n" +
                "_ Apple");
    }
    private static void checkSumSign(){
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result = a + b;
        if (result >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        System.out.println("Введите число (целое)");
        int value = scanner.nextInt();
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(){
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (a >= b){
            System.out.println("a >= b: " + a + " >= " + b);
        } else {
            System.out.println("a < b: " + a + " < " + b);
        }
    }
}
