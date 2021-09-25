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



    public void addWorkers(List<Worker> workers){
        workers.addAll(workers);
    }

    @Override
    public Position getPosition() {
        return Position.DIRECTOR;
    }

    @Override
    public int calculationSalary(){
        return 1000 * getPosition().getCoefficient() * experience * employees.size();
    }
}
