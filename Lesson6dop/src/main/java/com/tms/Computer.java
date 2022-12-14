package com.tms;

public class Computer {
    int costs;
    String model;
    RAM ram;
    HDD hdd;

    public Computer() {
    }
    public Computer(int costs, String model) {
        this.costs = costs;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }
    public Computer(int costs, String model, RAM ram, HDD hdd) {
        this.costs = costs;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void CompInfo(){
        System.out.println("Название :"+ this.model+"\nстоимость: "+this.costs + ram.InfoRAM() + hdd.InfoHDD());
    }
}
