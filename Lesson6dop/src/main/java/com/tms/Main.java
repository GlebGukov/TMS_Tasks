package com.tms;

public class Main {
    public static void main(String[] args) {
        Computer Comp1 = new Computer(555,"Asus");
        Computer Comp2 = new Computer(1000,"ASER",new RAM("Gigabyte",4),new HDD("Seagate",500,"Internal"));
        Comp1.CompInfo();
        System.out.println();
        Comp2.CompInfo();

    }
}
