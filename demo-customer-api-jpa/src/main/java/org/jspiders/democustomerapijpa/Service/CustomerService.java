package org.jspiders.democustomerapijpa.Service;

import org.jspiders.democustomerapijpa.Model.Customer;
import org.jspiders.democustomerapijpa.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public void addCustomer(Customer c) {
        repository.save(c);
    }

    public List<Customer> getAllCustomer() {
        List<Customer> data=repository.findAll();
        return data;
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Customer> getCustomerByName(String name) {
        return repository.findByCustomerName(name);
    }

    public Customer getCustomerByEmail(String email) {
       return repository.findByCustomerEmail(email);
    }

    public List<Customer> viewAllCustomer()
    {
        return repository.viewAllCustomer();
    }

    public List<Customer> custAgeGreaterThan(int age) {
        return repository.findByCustomerAgeGreaterThan(age);
    }

    public List<Customer> custTotalPurchaseLessThan(double age) {
        return repository.findByTotalPurchaseLessThan(age);
    }

    //return the list of customer having name=? and age=?

    public List<Customer> listOfCustNameAndCustAge(String name,int age)
    {

       return repository.findByCustomerNameAndCustomerAge(name,age);

    }

    //returns the list of customer having age between ? and ?
    public List<Customer> listCustHavingAgeBetween(int startAge,int endAge)
    {
       return repository.findByCustomerAgeBetween(startAge,endAge);

    }

    //JPQL Start
    public List<Customer> viewCustomer(String name)
    {
        return repository.viewCustomer(name);
    }

    public List<String> viewCustomerName(int age,double amt)
    {
        return repository.viewCustomerName(age,amt);
    }
    public  List<String> viewCustomerNameContains(String name)
    {
        return repository.viewCustomerNameContains(name);
    }

    public List<String > viewNameStartWith(String name)
    {
        return repository.viewNameeStartWith(name);
    }

    public List<String > viewNameEndWith(String name)
    {
        return repository.viewNameEndtWith(name);
    }
}
