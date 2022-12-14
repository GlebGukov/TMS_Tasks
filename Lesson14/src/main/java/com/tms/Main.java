package com.tms;

import task.Task;

import java.util.Scanner;

public class Main {
    static Task task = new Task();
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введенная дата это "+task.first(scanner));
            System.out.println("Следующий вторник "+task.second());
            System.out.println(task.third(scanner,"Sambrerro"));
        }
    }
}