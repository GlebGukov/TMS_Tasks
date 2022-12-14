package com.tms;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            firstTasks(scanner);
            secondTasks(scanner);
        }


    }

    public static void firstTasks(Scanner ipAddress) {
        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        System.out.println("Введите ip адрес");
        String ip = ipAddress.nextLine();
        Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(ip);
        if (m.find()) {
            System.out.println("Valid ip");
        }
        else {
            System.out.println("No valid ip");
        }
//        Основное задание
//        1. Написать программу для проверки на валидность введенного ip адреса.
//                Пусть ip адрес задается с консоли.
//                Программа должна проверять валидность введенного ip адреса с
//        помощью регулярного выражения и выводить результат проверки на
//        экран.
    }
//    Дополнительное задание
//      2. Программа на вход получает путь к папке (задается через консоль).
//    В заданной папке находятся текстовые файлы (формат тхт).
//    Каждый файл содержит произвольный текст. В этом тексте может быть
//    номер документа(один или несколько), емейл и номер телефона.
//    номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это
//    любая цифра, а y - это любая буква русского или латинского алфавита
//    номер телефона в формате: +(ХХ)ХХХХХХХ
//    Документ может содержать не всю информацию, т.е. например, может не
//    содержать номер телефона, или другое поле.
//    Необходимо извлечь информацию из N текстовых документов. Число
//    документов для обработки N задается с консоли.
//    Если в папке содержится меньше документов, чем заданное число -
//    следует обрабатывать все документы.
//    Извлеченную информацию необходимо сохранить в следующую
//    структуру данных:
//    Map<String, Document>, где
//    ключ типа String - это имя документа без расширения,
//    значение типа Document - объект кастомного класса, поля которого
//    содержат извлеченную из текстового документа информацию
//    Учесть вывод сообщений на случаи если,
//          - на вход передан путь к папке, в которой нет файлов
//          - все файлы имеют неподходящий формат (следует обрабатывать
//              только тхт файлы)
//          - так же сообщения на случай других исключительных ситуаций
//    TeachMeSkills.by
//    В конце работы программы следует вывести сообщение о том, сколько
//    документов обработано и сколько было документов невалидного
//    формата.

    public static void secondTasks(Scanner scanner){ // не разобрался
        System.out.println("Введите путь");
            String a = scanner.next();
            Path paths = Paths.get(a);
            String regexPath = "^([DC]:\\\\)(.+\\\\)$";
            Matcher m = Pattern.compile(regexPath).matcher(a);
            if (m.find()) {
                try {
                    System.out.println(Files.walkFileTree(paths,new MyFileVisitor()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("не верный путь");
            }

        }
        public static class MyFileVisitor extends SimpleFileVisitor<Path>{
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                System.out.println(file.getFileName());
                return FileVisitResult.CONTINUE;
            }
        }
//        private static void files (Scanner scanner){
//            int num = scanner.nextInt();
//            String validFile = "^([DC]:[\\\\])(.+\\.txt\\b)$";
//            Pattern patternFile = Pattern.compile(validFile);
//            Matcher matcherFile = patternFile.matcher(validFile);
//
//
//        }






//            Path path = Paths.get(pathToFile);
//            String validPath = "^([DC]:[\\\\])(.+\\\\$)";
//            String validFile = "^([DC]:[\\\\])(.+\\.txt\\b)$";
//            Pattern pattern = Pattern.compile(validPath);
//            Matcher matcher = pattern.matcher(pathToFile);
//            if (matcher.find()) {
//                try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
//                    String read = bufferedReader.readLine();
//                    while (read!=null){
//                        System.out.println(read);
//                        read = bufferedReader.readLine();
//                    }
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//
//            } else {
//                System.out.println("Не верный путь к файлу");
//            }
        }