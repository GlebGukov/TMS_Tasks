package com.tms;
import com.tms.DopExercise.*;
import com.tms.Figure.*;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Выберите номер ДЗ
                1-основное
                2-дополнительное
                3-закончить""");
        int enter = sc.nextInt();
        while (enter != 3) {
            switch (enter) {
                case 1 -> OwnDZ();
                case 2 -> DopDZ();
                default -> System.out.println("НОМЕР ЗАДАНИЯ ТОЛЬКО 1 или 2");
            }
            System.out.println("""
                    \nВыберите номер ДЗ
                    1-основное
                    2-дополнительное
                    3-закончить""");
            enter = sc.nextInt();
        }
        sc.close();
    }

    //        Основное задание
//        1. Написать иерархию классов «Фигуры».
//        Фигура -> Треугольник -> Прямоугольник -> Круг.
//                Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//        периметра.
//                Создать массив из 5 фигур.
//                Вывести на экран сумму периметра всех фигур в массиве.
//        2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//                Реализовать интерфейс с методом, который печатает название
//        должности и имплементировать этот метод в созданные классы.
    public static void OwnDZ () {
        System.out.println("Основное ДЗ");
        System.out.println();
        Triangle triangle1 = new Triangle("Geron", 20, 15, 11);
        Triangle triangle2 = new Triangle();
        triangle1.showinfo();
        System.out.println();
        triangle2.showinfo();
        System.out.println();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle("PRMYGOLNIK", 20, 12);
        rectangle2.showinfo();
        System.out.println();
        rectangle1.showinfo();
        System.out.println();
        Circle circle1 = new Circle("MIHAIL", 15);
        circle1.showinfo();
        System.out.println();
        Figure[] arr = {triangle1, triangle2, rectangle1, rectangle2, circle1};
        double sum = 0;
        for (Figure figure : arr) {
            double x = figure.perimeter();
            sum += x;
        }
        System.out.println("Сумма периметров всех фигур = " + sum);
    }
    public static void DopDZ () {
        System.out.println("Дополнительное ДЗ");
        System.out.println();
        Director zoo = new Director("Vasya", 50);
        Accountant biber = new Accountant("Milana", 25);
        Rabotyaga zavod = new Rabotyaga("Bob", 70);
        zoo.infoPeople();
        biber.infoPeople();
        zavod.infoPeople();
    }
}
