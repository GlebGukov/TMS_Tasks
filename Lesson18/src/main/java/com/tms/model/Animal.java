package com.tms.model;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "Animal")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Animal {
    @XmlElement
    private String animal,name;
    private int age;
    @XmlAttribute
    private int id;
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Животное: " + getAnimal() + "\nимя: " + getName() + "\nid: " + getId() + "\nвозраст: " + getAge() + " agex`";
    }

    public Animal() {
    }
}
