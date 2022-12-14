package com.tms;

import Dop.*;
import Own.StringForm;

public class Main{
    private static final String Doc = "1235-hee-9182-GDa-1B9a";
    private static final String Doc2 = "6666-ABC-1624-oiq-9j9j";
    private static final String Doc3 = "5555-ASk-6161-mmm-1a2b";
    public static void main(String[] args) {

        System.out.println(StringForm.form1(Doc));
        System.out.println(StringForm.form2(Doc2));
        System.out.println(StringForm.form3(Doc3));
        System.out.println(StringForm.form4(Doc3));
        System.out.println(StringForm.formABC(Doc2));
        System.out.println(StringForm.form555(Doc));
        System.out.println(StringForm.form1a2b(Doc3));

        Dop.dop2("123.12");
        Dop.dop1("HSDhjasdhg asdgygquy qygyug hsh uuw");

    }
}