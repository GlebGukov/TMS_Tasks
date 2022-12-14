package com.tms;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("""
                Добро пожаловать в систему <<Гуконтроль>> ваших счетов
                Введите номер карты какую вы хотите использовать:
                1-BelarusBank
                2-AlfaBank
                3-BPSBank
                666-завершить операцию""");
        int enter = scanner.nextInt();
        while (enter != 666) {
            switch (enter) {
                case 1 -> BelarusBank();
                case 2 -> AlfaBank();
                case 3 -> BPSBank();
                default -> System.out.println("На данный момент у вас только 3 карточки");
            }
            System.out.println("""
                    Введите номер карты какую вы хотите использовать
                    1-BelarusBank
                    2-AlfaBank
                    3-BPSBank
                    666-закончить работу""");
            enter = scanner.nextInt();
        }
        scanner.close();
    }

    public static void BelarusBank() {
        CreditCard one = new CreditCard("BelarusBank", 123456, 5000);
        System.out.println("""
                Вы вошли в личный кабинет карточки Беларусбанка.\s               
                Какую операцию вы хотите выполнить? :\s
                1 - Просмотреть статус счета\s
                2 - Пополнить сумму счета\s
                3 - Снять деньги со счета\s
                4 - Завершить операцию с данной картой""");
        int enter = scanner.nextInt();
        while (enter != 4) {
            switch (enter) {
                case 1 -> one.StatusCard();
                case 2 -> one.Cash();
                case 3 -> one.Withdraw();
                default -> System.out.println("Неправильный номер операции");
            }
            System.out.println("""
                    Какую операцию вы хотите выполнить? :
                    1 - Просмотреть статус счета
                    2 - Пополнить сумму счета
                    3 - Снять деньги со счета
                    4 - Завершить операцию с данной картой""");
            enter = scanner.nextInt();
        }
    }


    public static void AlfaBank() {
        CreditCard two = new CreditCard("Alfa", 54321, 10000);
        System.out.println("""
                Вы вошли в личный кабинет карточки Альфабанка.\s               
                Какую операцию вы хотите выполнить? :\s
                1 - Просмотреть статус счета\s
                2 - Пополнить сумму счета\s
                3 - Снять деньги со счета\s
                4 - Завершить операцию с данной картой""");
        int enter = scanner.nextInt();
        while (enter != 4) {
            switch (enter) {
                case 1 -> two.StatusCard();
                case 2 -> two.Cash();
                case 3 -> two.Withdraw();
                default -> System.out.println("Неправильный номер операции");
            }
            System.out.println("""
                    Какую операцию вы хотите выполнить? :
                    1 - Просмотреть статус счета
                    2 - Пополнить сумму счета
                    3 - Снять деньги со счета
                    4 - Завершить операцию с данной картой""");
            enter = scanner.nextInt();
        }
    }

    public static void BPSBank() {
        CreditCard three = new CreditCard("BPSBank", 12121212, 20000);
        System.out.println("""
                Вы вошли в личный кабинет карточки БПСБанка.\s               
                Какую операцию вы хотите выполнить? :\s
                1 - Просмотреть статус счета\s
                2 - Пополнить сумму счета\s
                3 - Снять деньги со счета\s
                4 - Завершить операцию""");
        int enter = scanner.nextInt();
        while (enter != 4) {
            switch (enter) {
                case 1 -> three.StatusCard();
                case 2 -> three.Cash();
                case 3 -> three.Withdraw();
                default -> System.out.println("Неправильный номер операции");
            }
            System.out.println("""
                    Какую операцию вы хотите выполнить? :
                    1 - Просмотреть статус счета
                    2 - Пополнить сумму счета
                    3 - Снять деньги со счета
                    4 - Завершить операцию""");
            enter = scanner.nextInt();
        }
    }
}