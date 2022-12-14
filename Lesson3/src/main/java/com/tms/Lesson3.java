package com.tms;
import java.util.Scanner;

public class Lesson3 {
    static Scanner main = new Scanner(System.in);

    public static void main(String[] args) {

        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
        eleven();
        main.close();
    }

    private static void one() {
        System.out.println("Вы просматриваете первое задание");
        System.out.println("Введите число месяца");
        int c = main.nextInt();
        switch (c) {
            case 1, 2, 12 -> System.out.println("Зима");// январь
            case 3, 4, 5 -> System.out.println("Весна");    // март
            case 6, 7, 8 -> System.out.println("Лето");    // июнь
            case 9, 10, 11 -> System.out.println("Осень");// сентябрь
            default -> System.out.println("неверное число месяца");
        }
    }

    private static void two() {
        System.out.println("Вы просматриваете второе задание");
        System.out.println("Введите число месяца");
        int c = main.nextInt();
        if (c <= 2 || c == 12) {
            System.out.println("Зима");
        } else if (c <= 5) {
            System.out.println("Весна");
        } else if (c <= 8) {
            System.out.println("Лето");
        } else if (c <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Такой поры года не существует");
        }
    }

    private static void three() {
        System.out.println("Вы просматриваете третье задание");
        System.out.println("какая температура у вас за окном?");
        int c = main.nextInt();
        if (c > -5) {
            System.out.println("Тепло");
        } else if (c > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    private static void four() {
        System.out.println("Вы просматриваете четвертое задание");
        System.out.println("Какой по счету цвет радуги вас интересует?");
        int c = main.nextInt();
        switch (c) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("1-Каждый 2-Охотник 3-Желает 4-Знать 5-Где 6-Сидит 7-Фазан");
        }
    }

    private static void five() {
        System.out.println("Вы просматриваете пятое задание");
        for (int w = 1; w <= 99; w++) {           // на экран нечетные числа от 1 до 99.
            if (w % 2 == 0) {                    //
                continue;
            }                  //
            System.out.println("Число " + w); // ЦИКЛЫ 1 ЗАДАНИЕ
        }
    }

    private static void six() {
        System.out.println("Вы просматриваете шестое задание");
        for (int i = 5; i >= 1; i--) {              // ЦИКЛЫ 2 ЗАДАНИЕ
            System.out.println("число " + i);
        } // Необходимо вывести на экран числа от 5 до 1. (--)
    }

    private static void seven() {
        System.out.println("Вы просматриваете седьмое задание");
        System.out.println("Введите целое положительное число");
        int c = main.nextInt();
        int we = 0;                                                 // сумма всех чисел от 1 до введенного
        for (int uyuy = 1; uyuy <= c; uyuy++)                           //
            we = uyuy + we;                                         //
        System.out.println("сумма всех чисел от 1 до введенного вами числа " + we);
    }

    private static void eight() {
        System.out.println("Вы просматриваете восьмое задание");
        int l = 0;                   // ЦИКЛЫ 4 ЗАДАНИЕ
        while (l <= 98) {               //
            l = l + 7;                   // последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
            System.out.println(l);   //
        }
    }

    private static void nine() {
        System.out.println("Вы просматриваете девятое задание");
        for (int jo = 0; jo >= -50; jo = jo - 5) {   // ЦИКЛЫ 5 ЗАДАНИЕ
            System.out.println(jo);         // Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        }                                   // ЦИКЛЫ 5 ЗАДАНИЕ
    }

    private static void ten() {
        System.out.println("Вы просматриваете десятое задание");
        for (int kvd = 10; kvd <= 20; kvd++) {     // ЦИКЛЫ 6 ЗАДАНИЕ
            int ijj = kvd * kvd;                //
            if (ijj <= 400) {                   // Составьте программу, выводящую на экран
                System.out.println(ijj);    // квадраты чисел от 10 до 20 включительно.
            }                               // ЦИКЛЫ 6 ЗАДАНИЕ
        }
    }

    private static void eleven() {
        System.out.println("Вы просматриваете одиннадцатое задание");
        int a = 1;
        int b = 1;
        int c;
        System.out.print("0 " + a + " " + b + " ");
        for (int f = 3; f <= 10; f++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}