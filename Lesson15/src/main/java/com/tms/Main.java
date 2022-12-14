package com.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        mainTasks();
        System.out.println();
        dopTasks();


    }
    private static void mainTasks (){
        //        Основное задание
//        1. Создать коллекцию класса ArrayList наполнить ее элементами
//        рандомными элементами типа Integer.
//        С помощью Stream'ов:
//                - Удалить дубликаты
//                - Вывести все четные элементы в диапазоне от 7 до 17
//        (включительно)
//                - Каждый элемент умножить на 2
//                - Отсортировать и вывести на экран первых 4 элемента
//                - Вывести количество элементов в стриме
//        - Вывести среднее арифметическое всех чисел в стриме
        System.out.println("                       !Основная работа!                       ");
        List<Integer> list = new ArrayList<>();
        while (list.size()<20){
            list.add(new Random().nextInt(30));
        }
        list = new ArrayList<>(list);
        System.out.println("Сгенерированная коллекция "+list);
        List <Integer> list2 = list.stream().distinct().toList();
        System.out.println("Убрали дубликаты: "+ list2);
        List <Integer> list3 = list2.stream().filter(x -> x >= 7 && x <= 17).toList();
        System.out.println("Вывели от 7 до 17 (включительно): "+ list3);
        List <Integer> list4 = list3.stream().map(g -> g * 2).toList();
        System.out.println("Умножили каждый элемент на 2: " + list4);
        List<Integer> list5 = list4.stream().sorted().limit(4).toList();
        System.out.println("Отсортировали и вывел первые 4 элемента: "+list5);
        System.out.println("Количество элементов коллекций: \n1ая: "+list.size()+"\n2ая: "+list2.size()+"\n3ая: "+list3.size()+"\n4ая: "+list4.size()+"\n5ая: "+list5.size());
        System.out.println("Среднее арифметическое всех чисел из 1 коллекции = "+ list.stream().reduce(Integer::sum).map(x->x/20).get());
        System.out.println("                       !Конец основной работы!                       ");
    }
    private static void dopTasks(){
        //        Дополнительное задание
//        2. Создать коллекцию класса ArrayList со значениями имен всех студентов
//        в группе
//        С помощью Stream'ов:
//                - Вернуть количество количество людей с вашим именем (вне
//        зависимости от верхнего/нижнего регистра букв)
//        - Выбрать все имена, начинающиеся на "а" (вне зависимости от
//        верхнего/нижнего регистра букв)
        System.out.println("                       !Дополнительная работа!                       ");
        List<String> students = List.of("Валерия", "Денис", "Глеб", "Ольга", "Роман", "Ольга", "Даниил",
                "Александр", "Елизавета", "Святослав", "Яна", "Мария", "Дмитрий", "Ирина", "Александр", "Даниил", "Юлия");
        System.out.println("Наши молодцы: "+students);
        String myName = "Глеб";
        int kolGlebov = (int) students.stream().filter(s -> s.equalsIgnoreCase(myName)).count();
        System.out.println("Количество моих тезок: "+ kolGlebov+"- я один единственный =Р");
        List<String> studentsA = students.stream().filter(x -> x.regionMatches(true,0,"А",0,1)).toList();    // true — игнорировать регистр, false — не игнорировать регистр.
        System.out.println("Имена, начинающиеся на а: "+ studentsA);                                                                         // other — другая строка, часть которой мы будем сравнивать.
                                                                                                                                             // ooffset — позиция, с которой начнем отсчет в строке other
                                                                                                                                             // len — количество символов для сравнения
                                                                                                                                             // toffset — позиция, с которой начнем отсчет.
    }
}





