package com.popova.lesson5.task1;

public class Person {
    private String name;
    private String lastName;


    public Person (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getFullName(){
        return name + " " +  lastName;
    }

}
