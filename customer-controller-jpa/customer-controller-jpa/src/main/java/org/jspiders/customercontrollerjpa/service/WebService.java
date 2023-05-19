package org.jspiders.customercontrollerjpa.service;
import org.jspiders.customercontrollerjpa.model.Customer;
import org.jspiders.customercontrollerjpa.repository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebService{
    @Autowired
    private WebRepository repository;

    public List<Customer> getAllCustomer() {
        return this.repository.findAll();
    }

    public void addCustomer(Customer c) {
        repository.save(c);
    }

    public Customer getCustomerById(int id) {
        Optional < Customer > optional = repository.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        } else {
            throw new RuntimeException(" Customer not found for id :: " + id);
        }
        return customer;
    }

    public void updateCustomer(Customer c) {
        repository.save(c);
    }

    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }
}
