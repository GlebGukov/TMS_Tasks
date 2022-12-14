package com.tms;

public class RAM {
    String Name;
    int memory;
    public RAM() {
        this.Name = "Silicon Power";
        this.memory = 1;
//        System.out.println("фирма оперативной памяти:"+ this.Name +", её память:"+ this.memory);
    }

    public RAM(String Name, int memory) {
        this.Name = Name;
        this.memory = memory;
    }
    public String InfoRAM(){
        return "\nНазвание оперативной памяти:"+ this.Name+",\nобьем памяти: "+this.memory;
    }
}