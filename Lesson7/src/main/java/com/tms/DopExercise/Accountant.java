package com.tms.DopExercise;

public class Accountant extends PeopleInfo implements Info{
    public Accountant (String name,int age){
        this.name = name;
        this.age = age;
        this.job = infoJob();
    }
    @Override
    public String infoJob() {
    return " accountant";
    }
}
