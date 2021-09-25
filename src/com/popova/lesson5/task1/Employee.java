package com.popova.lesson5.task1;

public abstract class Employee extends Person {
    public static enum Position{
        DIRECTOR, WORKER
    }

    protected int experience;
    protected int coefficient;

    public Employee(String name, String lastName) {
        super(name, lastName);
    }

    public int calculationSalary(){
        return 1000 * coefficient * experience;
    }

    public abstract Position getPosition();

}
