package org.jspiders.democustomerapijpa.Controller;

import org.jspiders.democustomerapijpa.Model.Customer;
import org.jspiders.democustomerapijpa.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    //add customer
    @PostMapping("/customers")
    public void addCustomer(@RequestBody Customer c)
    {
        service.addCustomer(c);
    }

    //display all customer
    @GetMapping("/customers")
    public List<Customer> getAllCustomer()
    {
       List<Customer> data= service.getAllCustomer();
       return data;
    }

    //get customer by id
    @GetMapping("getbyid/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") int id)
    {
        Customer c=service.getCustomerById(id);
        return c;
    }

    //get customer by name
    @GetMapping("/getbyname")
    public List<Customer> getCustomerByName(@RequestParam String name)
    {
        List<Customer> data=service.getCustomerByName(name);
        return data;
    }

    //get customer by email
    @GetMapping("/getbyemail")
    public Customer getCustomerByEmail(@RequestParam String email)
    {
        Customer c=service.getCustomerByEmail(email);
        return c;
    }

    //get customer having age greater than

    @GetMapping("/agegreater")
    public List<Customer> custAgeGrraterThan(@RequestParam int age)
    {
        List<Customer> data=service.custAgeGreaterThan(age);
        return data;
    }

    @GetMapping("/totalpurchaseless")
    public List<Customer> custTotalPurchaseLessThan(@RequestParam double amt)
    {
        List<Customer> data=service.custTotalPurchaseLessThan(amt);
        return data;
    }

    @GetMapping("/nameage/{name}/{age}")
    public List<Customer> listOfCustNameAndCustAge(@PathVariable(value = "name") String name,@PathVariable(value = "age") int age)
    {
        List<Customer> data=service.listOfCustNameAndCustAge(name,age);
        return data;
    }

    @GetMapping("agebetween/{age1}/{age2}")
    public List<Customer> listCustHavingAgeBetween(@PathVariable(value = "age1") int age1,@PathVariable(value = "age2") int age2)
    {
        List<Customer> data=service.listCustHavingAgeBetween(age1,age2);
        return  data;
    }

    @GetMapping("/customer1")
    public List<Customer> viewCustomer(@RequestParam String name)
    {
        List<Customer> data=service.viewCustomer(name);
        return data;
    }

    @GetMapping("/customer2")
    public List<String> viewCustomerName(@RequestParam int age,@RequestParam double amt)
    {
        List<String> data=service.viewCustomerName(age,amt);
        return  data;
    }

    @GetMapping("/customer3")
    public  List<String> viewCustomerNameContains(@RequestParam String name)
    {
        List<String> data=service.viewCustomerNameContains(name);
        return data;
    }

    @GetMapping("/customer4")
    public List<String > viewNameStartWith(@RequestParam String name)
    {
        return service.viewNameStartWith(name);
    }

    @GetMapping("/customer5")
    public List<String > viewNameEndWith(@RequestParam String name)
    {
        return service.viewNameEndWith(name);
    }

    @GetMapping("sql")
    public List<Customer> viewAllCustomer()
    {
        return service.viewAllCustomer();
    }

}
