package com.popova.lesson5.task1;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

    private List<Employee> employees = new ArrayList<>();

    public Director(String name, String lastName, int experince) {
        super(name, lastName, experince);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;

    }

    @Override
    public Position getPosition() {
        return Position.DIRECTOR;
    }

    @Override
    public int calculationSalary(){
        return 1000 * getPosition().getCoefficient() * experience * employees.size();
    }

    @Override
    public String toString(){
        return "Name: " + name + " " + lastName + " " + calculationSalary() + " Experience: " + experience + " Position: " + getPosition() + " Emploees: " + employees ;
    }
}
