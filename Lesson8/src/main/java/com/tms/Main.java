package com.tms;
import com.tms.Phone.*;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    static Phone phone1;
    static Phone phone2;
    static Phone phone3;
    static int q;

    public static void main(String[] args) {
        int number;
        String model;
        int weight;
        System.out.println("Программа по инициализации переменных нового телефона (номер, модель,вес)");
        for (int phone = 1; phone <= 3; phone++) {
            System.out.println("устанавливаем параметры " + phone + " телефона.Введите номер телефона");
            number = sc.nextInt();
            sc.nextLine();
            System.out.println("устанавливаем параметры " + phone + " телефона.Введите Модель телефона");
            model = sc.nextLine();
            System.out.println("устанавливаем параметры " + phone + " телефона.Укажите вес телефона");
            weight = sc.nextInt();
            if (phone == 1) {
                phone1 = new Phone(number, model, weight);
            } else if (phone == 2) {
                phone2 = new Phone(number, model, weight);
            } else {
                phone3 = new Phone(number, model, weight);
            }
        }
        System.out.println();
        System.out.println("Какой телефон будем использовать?\n1: " + phone1.getModel() + "\n2: " + phone2.getModel() + "\n3: " + phone3.getModel() + "\n4: Конец работы");
        q = sc.nextInt();
        while (q != 4) {
            switch (q) {
                case 1 -> Phone1();
                case 2 -> Phone2();
                case 3 -> Phone3();
                default -> System.out.println("Только 3 телефона в наличии");
            }
            System.out.println("Какой телефон будем использовать?\n1: " + phone1.getModel() + "\n2: " + phone2.getModel() + "\n3: " + phone3.getModel() + "\n4: Конец работы");
            q = sc.nextInt();
        }
        sc.close();
    }

    public static void Phone1() {
        System.out.println("Панель управления телефоном " + phone1.getModel());
        phone1.Cycle("Inna", 7587533, 1617888, 6566782);
    }

    public static void Phone2() {
        System.out.println("Панель управления телефоном " + phone2.getModel());
        phone2.Cycle("Alex", 3652217, 1516661, 2342345);
    }


    public static void Phone3() {
        System.out.println("Панель управления телефоном " + phone3.getModel());
        phone3.Cycle("Oleg", 2368851, 2525666, 2344268);
    }
}