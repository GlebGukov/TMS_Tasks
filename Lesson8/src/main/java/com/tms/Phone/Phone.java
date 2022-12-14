package com.tms.Phone;


import java.util.Arrays;
import java.util.Scanner;

public class Phone {

    private int number;
    private String model;

    private int weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("На телефон " + getModel() + " " + getNumber() + " поступал вызов от абонента " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("На телефон " + getModel() + " " + getNumber() + " поступал вызов от абонента " + name +" с номера "+number );
    }

    public void infoVariables() {
        System.out.println("Номер телефона: " + getNumber() + ", модель: " + getModel() + ", вес: " + getWeight());
    }
    public void sendMessage (int ...a){
        System.out.println("Вы отправили сообщение на номера:"+ Arrays.toString(a));
    }

    public void Cycle(String name,int number,int number2, int number3) {
        Scanner cs = new Scanner(System.in);
        System.out.println("""
                Какую операцию хотите выполнить?:
                1-Посмотреть информацию о телефоне
                2-Информация о крайнем входящем вызове (имя)
                3-Информация о крайнем входящем вызове (имя + номер)
                4-Отправить сообщения
                5-Выйти с данного телефона""");
        int q = cs.nextInt();
        while (q != 5) {
            switch (q) {
                case 1 -> infoVariables();
                case 2 -> receiveCall(name);
                case 3 -> receiveCall(name,number);
                case 4 -> sendMessage(number,number2,number3);
                default -> System.out.println("Только 2 операции");
            }
            System.out.println("""
                    Какую операцию хотите выполнить?
                    1-Посмотреть информацию о телефоне
                    2-Информация о крайнем входящем вызове (имя)
                    3-Информация о крайнем входящем вызове (имя + номер)
                    4-Отправить сообщения
                    5-выйти с данного телефона""");
            q = cs.nextInt();
        }
    }
}


