package com.tms.task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;

public class Task {

    public DayOfWeek first(Scanner scanner) {
        System.out.println("Введите дату в формате dd-MM-yyyy");
        while (true) {
            try {
                return LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy")).getDayOfWeek();
            } catch (DateTimeParseException ignored) {
            }
        }
    }

    public LocalDate second() {
        return LocalDate.now().with(next(DayOfWeek.TUESDAY));
    }

    public String third(Scanner scanner, String string) {
        System.out.println("Чтобы реверсировать строку нашмите 1");
        if (scanner.nextLine().equals("1")) {
            TaskThree<String> reverse = s -> new StringBuilder(string).reverse().toString();
            return reverse.string(string);
        }
        return string;
    }
}

