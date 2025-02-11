package ru.otus.myAppWeb.controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import ru.otus.myAppWeb.exceptions.EmployeeWrongNameExctption;
import ru.otus.myAppWeb.model.Employee;
import ru.otus.myAppWeb.service.EmployeeService;


import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(value = "/add")
    public Employee add(@RequestParam String first,
                        @RequestParam String second,
                        @RequestParam int branchId,
                        @RequestParam int salary) {
        if(StringUtils.isEmpty(first)||StringUtils.isEmpty(second)){
            throw new EmployeeWrongNameExctption("поле запроса не должно быть пустым!");
        }
        return service.add(first, second, branchId, salary);
    }

    @RequestMapping(value = "/find/{first}/{second}")
    public Employee findEmployee(@PathVariable String first, @PathVariable String second) {
        return service.findEmployee(first, second);
    }

    @RequestMapping(value = "/remove/{first}/{second}")
    public Employee remove(@PathVariable String first, @PathVariable String second) {
        return service.remove(first, second);
    }

    @RequestMapping(value = "/find/all")
    public List<Employee> findAll() {
        return service.findAll();
    }
}
