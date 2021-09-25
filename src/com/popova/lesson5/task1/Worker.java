package com.popova.lesson5.task1;

public class Worker extends Employee {


    public Worker(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public Position getPosition() {
        return Position.WORKER;
    }


}
