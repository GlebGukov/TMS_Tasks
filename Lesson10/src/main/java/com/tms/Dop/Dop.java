package com.tms.Dop;

public class Dop {


    public static void dop1(String Pishi){
//        2. Дана строка произвольной длины с произвольными словами.
//                Найти самое короткое слово в строке и вывести его на экран.
//        Найти самое длинное слово в строке и вывести его на экран.
//                Если таких слов несколько, то вывести последнее из них.

        String [] a = Pishi.split(" ");
        String max = "";
        String min = "";
        for (String go : a){
            if (go.length()>max.length()){
                max = go;
            }
            if (max.length()>go.length()){
                min = go;
            }
        }

        System.out.println("самое длинное слово в заданной строке "+max +" самое короткое ="+min);

    }
    public static void dop2(String dybl) {
        StringBuilder sb = new StringBuilder();
        for (char c : dybl.toCharArray()) {
            sb.append(c);
            sb.append(c);
        }
        System.out.println(sb);
    }
}