package org.jspiders.employeeapi.controller;

import org.jspiders.employeeapi.model.Employee;
import org.jspiders.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        List<Employee> data=service.getAllEmployees();
        return data;
    }

    @GetMapping("/employees{id}")
    public Employee displayOneEmployee(@PathVariable(value = "id") int id)
    {
        return service.displayOneEmployee(id);
    }
//
//    @PostMapping("/employees")
//    public void addEmployee(@RequestBody Employee e)
//    {
//        service.addEmployee(e);
//    }
//
//    @PutMapping("/employees/{id}")
//    public void updateEmployee(@PathVariable(value = "id") int id, @RequestBody Employee e)
//    {
//        service.updateEmployee(id,e);
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public void deleteEmployee(@PathVariable(value="id") int id)
//    {
//        service.deleteEmployee(id);
//    }
}
