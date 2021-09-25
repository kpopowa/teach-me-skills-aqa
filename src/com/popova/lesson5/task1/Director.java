package com.popova.lesson5.task1;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{

    private List<Worker> workers = new ArrayList<>();

    public Director(String name, String lastName) {
        super(name, lastName);
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    @Override
    public Position getPosition() {
        return Position.DIRECTOR;
    }

    @Override
    public int calculationSalary(){
        return 1000 * coefficient * experience * workers.size();
    }
}
