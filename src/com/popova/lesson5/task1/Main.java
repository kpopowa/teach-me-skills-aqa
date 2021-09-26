package com.popova.lesson5.task1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Kristina", "Popowa");

        System.out.println(person);

        Worker worker1 = new Worker("Ivan", "Ivanov" , 2);
        Worker worker2 = new Worker("Petr", "Petrov", 3);
        Worker worker3 = new Worker("Egor", "Egorow", 4);

        Director director = new Director("Sergey", "Sergeew", 3);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(director);

        director.addEmployee(worker1);
        director.addEmployee(worker2);

        System.out.println(director);

        Director director2 = new Director("Andrew", "Andreew", 1);
        director2.addEmployee(worker3);
        director.addEmployee(director2);
        System.out.println(director2);
        System.out.println(director);
    }
}
