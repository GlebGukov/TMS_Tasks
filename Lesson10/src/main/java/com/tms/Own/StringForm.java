package com.tms.Own;

public class StringForm {


    public static String form1(String name) {
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
        if (name.isBlank()) {
            return "Введите корректно номер документа по формату xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.";
        } else {
            name = name.replaceAll("[A-z]", "").substring(0, 10).replace("--", "-");
            return name;
        }
    }

    public static String form2(String name) {
//        - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        name = name.replaceAll("\\D[a-z-A-Z]{4}", "\s***\s");
        return name;
    }

    public static String form3(String name) {
//        - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        name = name.replaceAll("\\d", "").toLowerCase().replaceAll("(--|-)", " ").trim().replaceAll(" ", "/");
        return name;
    }

    public static String form4(String name) {
//        - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
        name = name.replaceAll("\\d", "").toUpperCase().replaceAll("(--|-)", " ").trim().replaceAll(" ", "/");
        StringBuilder sb = new StringBuilder("Letters:\s");
        sb.append(name);
        return sb.toString();
    }

    public static boolean formABC(String name) {
        //        - Проверить содержит ли номер документа последовательность abc и
//        вывети сообщение содержит или нет(причем, abc и ABC считается
//                одинаковой последовательностью).
        return name.contains("abc") || name.contains("ABC");
    }

    public static boolean form555(String name) {
//        - Проверить начинается ли номер документа с последовательности
//        555.;
        return name.startsWith("555");
    }

    public static boolean form1a2b(String name) {
//        - Проверить заканчивается ли номер документа на
//        последовательность 1a2b.
        return name.endsWith("1a2b");
    }
}
