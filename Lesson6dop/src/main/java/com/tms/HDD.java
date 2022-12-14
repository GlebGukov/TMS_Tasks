package com.tms;

public class HDD {
    String Name;
    int memory;
    String Type;

    public HDD (){
        this.Name = "Toshiba";
        this.memory = 512;
        this.Type = "Internal";
//        System.out.println("Фирма жесткого диска:"+ this.Name +". Его память:"+ this.memory+". Тип жесткого диска: "+this.Type);
    };
    public HDD (String name, int memory, String type){
        this.Name=name;
        this.memory=memory;
        this.Type=type;
    }
    public String InfoHDD(){
        return "\nНазвание жесткого диска:"+ this.Name+",\nобьем памяти: "+this.memory+",\nтип: "+this.Type;
    }
}
