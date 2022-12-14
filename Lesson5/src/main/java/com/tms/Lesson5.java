package com.tms;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер задания (1,2,3,4), для окончания работы напишите 666");
        int Enter = scanner.nextInt();
        while (Enter!=666){
            switch (Enter) {
                case 1 -> Exercise_1();
                case 2 -> Exercise_2();
                case 3 -> Exercise_3();
                case 4 -> Exercise_4();
                default -> System.out.println("Было только 4 задания!");
            }
            System.out.println("\nВведите номер задания (1,2,3,4), для окончания работы напишите 666");
            Enter = scanner.nextInt();
        }
        scanner.close();
    }
//            } else {
//                System.out.println("Мимо кассы =Р");
//                break;
//            }
//        } while (enter == end);

    private static void Exercise_1() {
        //    1. Создать трехмерный массив из целых чисел.
        //    С помощью циклов "пройти" по всему массиву и увеличить каждый
        //    элемент на заданное число. Пусть число, на которое будет
        //    увеличиваться каждый элемент, задается из консоли.
        System.out.println("Задание №1");
        int[][][] arrive1 = {{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        System.out.println(Arrays.deepToString(arrive1));
        System.out.println();
        System.out.println("На какое число увеличиваем каждое число из массива?");
        int en = scanner.nextInt();
        System.out.print("Вот как выглядят числа массива после увеличения :");
        for (int[][] i : arrive1) {
            for (int[] j : i) {
                for (int g : j) {
                    g += en;
                    System.out.print(g + " ");
                }
            }
        }
        System.out.println();
    }

    private static void Exercise_2() {
        System.out.println("Задание №2");
        System.out.println();
        //    2. Шахматная доска
        //    Создать программу для раскраски шахматной доски с помощью цикла.
        //    Создать двумерный массив String'ов 8х8. С помощью циклов задать
        //    элементам циклам значения B(Black) или W(White). Результат работы
        //    программы:
        //    W B W B W B W B
        //    B W B W B W B W
        //    W B W B W B W B
        //    B W B W B W B W
        //    W B W B W B W B
        //    B W B W B W B W
        //    W B W B W B W B
        //    B W B W B W B W
        String[][] shax = new String[8][8];
        String b = "B";
        String w = "W";
        for (int i = 0; i < shax.length; i++) {
            for (int x = 0; x < shax[i].length; x++) {
                if (i % 2 == 0 && x % 2 == 0 || i%2!=0 && x%2!=0) {
                    shax[i][x] = w;
                }
                else{
                    shax[i][x] = b;
                }
                System.out.print(shax[i][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Exercise_3() {
        //    3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
        //    всех элементов массива.
        System.out.println("Задание №3");
        System.out.println("Сколько строк в двумерном массиве создаем?");
        int x = scanner.nextInt();
        System.out.println("Сколько выделяем значений в каждую строку двумерного массива ?");
        int y = scanner.nextInt();
        System.out.println("Выводим наш полученный двумерный массив");
        int[][] arr = new int[x][y];
        Integer Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int o = 0; o < arr[i].length; o++) {
                arr[i][o] = (int) (Math.random() * 50);
                Sum += arr[i][o];
                System.out.print(arr[i][o] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сумма всех чисел из нашего массива: ");
        System.out.println(Sum);
        System.out.println();
    }

    private static void Exercise_4() {
        //    4. Создайте двумерный массив целых чисел. Отсортируйте элементы в
        //    строках двумерного массива по возрастанию.
        System.out.println("Задание №4");
        System.out.println("Сколько строк в двумерном массиве создаем?");
        int x = scanner.nextInt();
        System.out.println("Сколько выделяем значений в каждую строку двумерного массива ?");
        int y = scanner.nextInt();
        System.out.println("Выводим наш полученный двумерный массив");
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int o = 0; o < arr[i].length; o++) {
                arr[i][o] = (int) (Math.random() * 20);
                System.out.print(arr[i][o] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сортируем наш массив: ");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                Arrays.sort(ints);
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}