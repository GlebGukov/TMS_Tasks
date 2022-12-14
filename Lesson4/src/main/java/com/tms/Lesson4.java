package com.tms;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер основного дз (1,2,3,4) + доп дз (5,6,7,8)");
        switch (scanner.nextInt()) {
            case 1 -> HW1();
            case 2 -> HW2();
            case 3 -> HW3();
            case 4 -> HW4();
            case 5 -> HWDop1();
            case 6 -> HWDop2();
            case 7 -> HWDop3();
            case 8 -> HWDop4();
        }
        scanner.close();
    }

    private static void HW1() {
        //        0. Создайте массив целых чисел. Напишете программу, которая выводит
//                   сообщение о том, входит ли заданное число в массив или нет.
//                   Пусть число для поиска задается с консоли (класс Scanner).
        System.out.println("Первое задание");
        System.out.println("Какое число вы хотите проверить, входит ли оно в массив?");
        int x = scanner.nextInt();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 44, 55, 90};
        int q = Arrays.binarySearch(arr, x);
        if (x == q) {
            System.out.println("ваше число " + x + " есть в массиве, c индексом" + " " + q);
        }
        if (x != q) {
            System.out.println("Вашего числа нету в массиве");
        }
        scanner.close();
    }



    private static void HW2() {
        //        1.  Создайте массив целых чисел. Удалите все вхождения заданного
//                числа из массива.
//                Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//                выведите сообщения об этом.
//                В результате должен быть новый массив без указанного числа.
        System.out.println("Второе задание");
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Наш массив чисел");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Какое число удаляем из массива?");

        int delete;
        if (scanner.hasNextInt()) {
            delete = scanner.nextInt();
            boolean re = false;

            for (int i = 0; i < (arr.length); i++) {
                if (arr[i] == delete) {
                    arr[i] = 0;
                    re = true;
                }
            }
            if (re) {
                System.out.print("Так выглядит массив после удаления: ");
                for (int j : arr) {
                    System.out.print(j + " ");
                }
                System.out.println();
            } else System.out.println("Числа нет в массиве!");
        } else System.out.println("Ввели не число!");
    }

    private static void HW3() {
//            2.  Создайте и заполните массив случайным числами и выведете
//                максимальное, минимальное и среднее значение.
//                Для генерации случайного числа используйте метод Math.random().
//                Пусть будет возможность создавать массив произвольного размера.
//                Пусть размер массива вводится с консоли.
        System.out.println("Третье задание");
        System.out.println("Какой размер массива создать?(числом)");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Размер вашего массива " + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.print(": числа вашего массива");
        System.out.println();
        int min = arr[0];
        int max = arr[0];
        double avg = 0;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        for (int j : arr) {
            avg = avg + (double) j / arr.length;
        }
        System.out.println("минимальное число - " + min);
        System.out.println("максимальное число - " + max);
        System.out.println("Среднее значение всех чисел - " + avg);
        scanner.close();
    }

//    Random rnd = new Random();
//    for (int i = 0; i < arr.length; i++) {
//        arr[i] = rnd.nextInt(111);
//        System.out.print(arr[i] + " ");
//    }
//    int min = arr[0];
//    for (int i = 0; i < arr.length; i++) {
//        if (min > arr[i]) {
//            min = arr[i];
//        }
//    }
//    System.out.println("min is "+min);


    private static void HW4() {
        //                3. Создайте 2 массива из 5 чисел.
        //                Выведите массивы на консоль в двух отдельных строках.
        //                Посчитайте среднее арифметическое элементов каждого массива и
        //                сообщите, для какого из массивов это значение оказалось больше (либо
        //                сообщите, что их средние арифметические равны).
        System.out.println("Четвертое задание");
        int p = 5;
        int[] arr1 = new int[p];
        int[] arr2 = new int[p];
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("сгенерированные рандом числа первого массива: ");
        for (int i = 0; i < p; i++) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("сгенерированные рандом числа второго массива: ");
        for (int i = 0; i < p; i++) {
            arr2[i] = (int) (Math.random() * 100);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int x : arr1) {
            sum1 = sum1 + x;
        }
        System.out.println("Сумма чисел первого массива = " + sum1);
        for (int x : arr2) {
            sum2 = sum2 + x;
        }
        System.out.println("Сумма чисел второго массива = " + sum2);
        if (sum1 > sum2) {
            System.out.println("Cумма чисел первого массива больше, чем у второго");
        } else if (sum1 < sum2) {
            System.out.println("Cумма чисел второго массива больше, чем у первого");
        } else {
            System.out.println("Сумма чисел первого и второго массива равны");
        }
    }


    //                Дополнительное задание
    private static void HWDop1() {
//        4. Создайте массив из n случайных целых чисел и выведите его на экран.
//        Размер массива пусть задается с консоли и размер массива может быть
//        больше 5 и меньше или равно 10.
//        Если n не удовлетворяет условию - выведите сообщение об этом.
//                Если пользователь ввёл не подходящее число, то программа должна
//        просить пользователя повторить ввод.
//        Создайте второй массив только из чётных элементов первого массива,
//                если они там есть, и вывести его на экран.
        System.out.println("Доп второе задание");
        System.out.println("Из скольки элементов создаем массив? количество элементов должно быть в диапазоне >5 и <=10");
        int rand;
        do {
            rand = scanner.nextInt();
            System.out.println("Выходите из диапазона указанных чисел, повторите (>5 и <=10)");
        } while (!(rand > 5 && rand <= 10));

        int[] arr1 = new int[rand];
        int[] arr2 = new int[rand];
        System.out.println("Наш массив: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int aa;
        arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Убираем нечетные цифры из массива");
        for (aa = 0; aa < arr2.length; aa++) {
            if (!(arr2[aa] % 2 == 0) || arr2[aa]==0){
                continue;
            }
            System.out.print(arr2[aa]+" ");
        }
        scanner.close();
    }

    private static void HWDop2() {
//                5. Создайте массив и заполните массив.
//                Выведите массив на экран в строку.
//                Замените каждый элемент с нечётным индексом на ноль.
//                Снова выведете массив на экран на отдельной строке.
        System.out.println("Доп второе задание");
        System.out.println("Первоначальный массив из чисел :");
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(11);
            System.out.print(arr[i] + " ");
            if (!(arr[i] % 2 == 0)) {
                arr1[i] = 0;
            } else {
                arr1[i] = arr[i];
            }
        }
        System.out.println();
        System.out.println("Изменяем нечетные числа из массива на ноль :");
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }

    private static void HWDop3() {
//        6. Создайте массив строк. Заполните его произвольными именами
//        людей.
//                Отсортируйте массив.
//                Результат выведите на консоль.
        System.out.println("Доп третье задание");
        System.out.println("Массив из имен :");
        String[] names = {"Борис", "Кирилл", "Антон", "Евлампий", "Дмитрий", "Владислав"};
        for (String name : names) {
            System.out.print(name + " ");
        }
        Arrays.sort(names);
        System.out.println();
        System.out.println("Приводим порядок имен в алфавитный порядок: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    private static void HWDop4() {
//        7.Реализуйте алгоритм сортировки пузырьком.
        System.out.println("Доп четвертое задание");
        System.out.println("Введите желаемый размер массива из случайных чисел");
        int ve = scanner.nextInt();
        Random rnd = new Random();
        int[] BUBL = new int[ve];
        System.out.println("Ваш случайный сгенерированный массив из чисел: ");
        for (int i = 0; i < BUBL.length; i++) {
            BUBL[i] = rnd.nextInt(50);
            System.out.print(BUBL[i] + " ");
        }
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < BUBL.length - 1; i++) {
                if (BUBL[i] > BUBL[i + 1]) {
                    temp = BUBL[i];
                    BUBL[i] = BUBL[i + 1];
                    BUBL[i + 1] = temp;
                    sorted = false;

                }
            }
        }
        System.out.println();
        System.out.println("Сортировка ПУЗЫРЕМ :");
        for (int j : BUBL) {
            System.out.print(j + " ");
        }
    }
}