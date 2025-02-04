package ru.otus.myAppWeb.service;


import ru.otus.myAppWeb.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(String firstName, String secondName, int branchId, int salary);

    Employee remove(String firstName, String secondName);

    Employee findEmployee(String firstName, String secondName);

    List<Employee> findAll();
}
