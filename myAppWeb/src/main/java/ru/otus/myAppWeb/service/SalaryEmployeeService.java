package ru.otus.myAppWeb.service;

import ru.otus.myAppWeb.model.Employee;

import java.util.List;
import java.util.Map;

public interface SalaryEmployeeService {
    Employee maxSalary(int branch);
    Employee minSalary(int branch);
    List<Employee> allEmployeeBranch(int branch);
    Map<Integer, List<Employee>> allEmployeeAllBranches();
}
