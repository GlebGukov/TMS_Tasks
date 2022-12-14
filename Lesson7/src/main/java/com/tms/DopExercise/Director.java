package com.tms.DopExercise;

public class Director extends PeopleInfo implements Info{
    public Director (String name,int age){
        this.name = name;
        this.age = age;
        this.job = infoJob();
    }
    @Override
    public String infoJob() {
    return " Director ZOO";
    }
}
