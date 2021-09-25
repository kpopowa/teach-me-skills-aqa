package com.popova.lesson5.task1;

public abstract class Employee extends Person {
    public static enum Position{
        DIRECTOR(2), WORKER(1);

        private int coefficient;

        private Position(int coefficient){
            this.coefficient = coefficient;
        }

        public int getCoefficient() {
            return coefficient;
        }
    }

    protected int experience;

    public Employee(String name, String lastName, int experience) {
        super(name, lastName);
        this.experience = experience;
    }

    public int calculationSalary(){
        return 1000 * getPosition().coefficient * experience;
    }

    public abstract Position getPosition();

    @Override
    public String toString() {
        return name + " " + lastName + " " + calculationSalary();

    }

}
