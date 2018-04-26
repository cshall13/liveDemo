package com.bootcamp.livedemo.Model;

public class Student {

    //attributes that belong/describe student
    private String name;
    private int age;

    //default constructor
    public Student(){}

    //constructor (made be right click -> generate -> constructor -> and choose attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters that are you used to apply attributes to new instances made throughout the project

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

}
