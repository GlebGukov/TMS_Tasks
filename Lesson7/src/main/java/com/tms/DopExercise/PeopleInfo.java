package com.tms.DopExercise;

public abstract class PeopleInfo {
    String name;
    String job;
    int age;
    public void infoPeople (){
        System.out.println("Мое имя "+this.name+", мне "+this.age+" лет, и моя должность: "+ job);
    };
}
