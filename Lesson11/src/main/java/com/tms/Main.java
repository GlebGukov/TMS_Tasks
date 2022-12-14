package com.tms;
import com.tms.Tasks_out_of_10_lesson.*;

public class Main {

    private static final String Doc = "1235-hee-9182-GDa-1B9a";
    private static final String Doc2 = "6666-ABC-1624-oiq-9j9j";
    private static final String Doc3 = "5555-ASk-6161-mmm-1a2b";

    public static void main(String[] args){

        System.out.println();
        Lesson10.formABC("sadnjbqi");
        Lesson10.formABC("");
        Lesson10.formABC(Doc);
        Lesson10.formABC(Doc2);

        System.out.println();

        Lesson10.form555(Doc3);
        Lesson10.form555(Doc);
        Lesson10.form555("");
        Lesson10.form555("asdqq");

        System.out.println();

        Lesson10.form1a2b(Doc3);
        Lesson10.form1a2b(Doc2);
        Lesson10.form1a2b("");
        Lesson10.form1a2b("kjfh111");

    }

}