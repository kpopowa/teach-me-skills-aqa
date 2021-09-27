package com.popova.lesson5.task1;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    @Override
    public Employee findEmployeeByName(Director director, String name) {
        for(Employee employee : director.getEmployees()){
            if (employee.name.equalsIgnoreCase(name)){
                return employee;
            }

        }
        return null;

    }

}
