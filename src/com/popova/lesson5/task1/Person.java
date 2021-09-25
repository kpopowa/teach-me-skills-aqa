package com.popova.lesson5.task1;

public class Person {
    protected String name;
    protected String lastName;


    public Person (String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
