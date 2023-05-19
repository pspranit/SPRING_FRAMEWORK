package org.jspiders.employeeapi.service;

import org.jspiders.employeeapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class EmployeeService {

    List<Employee> employeeList=new ArrayList<>();

    {
        employeeList.add(new Employee(1,"PRANIT","DEVELOPER",50000.25));
        employeeList.add(new Employee(2,"PRANIT","DEVELOPER",50000.25));
        employeeList.add(new Employee(3,"PRANIT","DEVELOPER",50000.25));
        employeeList.add(new Employee(4,"PRANIT","DEVELOPER",50000.25));

    }
    public List<Employee> getAllEmployees()
    {
        return employeeList;
    }

    public Employee displayOneEmployee(int id)
    {
//        for(int i=0;i<employeeList.size();i++)
//        {
//            Employee e=employeeList.get(i);
//            if(e.getEmpId()==id)
//            {
//                return e;
//            }
//        }
        ListIterator<Employee> iterator=employeeList.listIterator();
        Employee e = null;

        while(iterator.hasNext())
        {
            iterator.next();
            if(e.getEmpId()==id)
            {
                return e;
            }
        }
        return null;
    }

    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    public void updateEmployee(int id, Employee e) {
        for(int i=0;i<employeeList.size();i++)
        {
            Employee emp= employeeList.get(i);

            if(emp.getEmpId()==id)
            {
                employeeList.set(i,emp);
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        for(int i=0;i<employeeList.size();i++)
        {
            Employee emp= employeeList.get(i);

            if(emp.getEmpId()==id)
            {
                employeeList.remove(i);
            }
        }
    }
}
