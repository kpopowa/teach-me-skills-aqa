package com.popova.lesson5.task1;

public class Worker extends Employee {


    public Worker(String name, String lastName, int experience) {
        super(name, lastName, experience);

    }

    @Override
    public Position getPosition() {
        return Position.WORKER;
    }


}
