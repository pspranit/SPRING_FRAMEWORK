package org.jspiders.customercontrollerjpa.controller;

import org.jspiders.customercontrollerjpa.model.Customer;
import org.jspiders.customercontrollerjpa.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired
    private WebService service;

    //Home page
    @GetMapping("/")
    public String homePage(Model model)
    {
        return "customer";
    }

    //Show customer
    @GetMapping("/displaycustomer")
    public String showCustomer(Model model)
    {
        model.addAttribute("customer",service.getAllCustomer());
                return "customerinfo";
    }


    //Show customer form
    @GetMapping("/showform")
    public String showCustomerForm(Model model)
    {
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "customerinfo";
    }

    //save customer
    @PostMapping("/savecustomer")
    public String addCustomer(Customer c)
    {
        service.addCustomer(c);
        return "redirect:/";
    }


    //update form
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {


        Customer customer = service.getCustomerById(id);

        model.addAttribute("customer", customer);
        return "updateform";
    }

    //perform update operation
    @GetMapping("/updateCustomer")
    public String changeProduct(Customer c)
    {
       service.updateCustomer(c);
        return "redirect:/";
    }

    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable(name = "id") int id)
    {
        service.deleteCustomer(id);
        return "redirect:/";
    }
}
