package com.tms.DopExercise;

public class Rabotyaga extends PeopleInfo implements Info{

    public Rabotyaga (String name,int age){
        this.name = name;
        this.age = age;
        this.job = infoJob();
    }

    @Override
    public String infoJob() {
    return " rabotyaga на заводе";
    }

}
