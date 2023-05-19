package org.jspiders.demospringaccount.controller;

import org.jspiders.demospringaccount.model.Account;
import org.jspiders.demospringaccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService service;

    //home page
    @GetMapping("/")
    public String homePage(Model model)
    {
        return "homepage";
    }
    @GetMapping("/display")
    public String displayAccount(Model model)
    {
        model.addAttribute("accounts",service.getAllAccounts());
        return "displayaccount";
    }

    //display accounts
    @GetMapping("/display1")
    public String displayAccount1(Model model)
    {
        model.addAttribute("accounts",service.getAllAccounts());
        return "displayaccount";
    }

    //show account form
    @GetMapping("/addaccount")
    public String createAccountForm(Model model)
    {
        Account account=new Account();
        model.addAttribute("accounts",account);
        return "createaccount";
    }

    //save account
    @PostMapping("/save")
    public String addAccount(@ModelAttribute("accounts") Account account)
    {
        service.addAccount(account);
        return "redirect:/";
    }

    //show withdraw form
    @GetMapping("/withdraw")
    public String withdrawForm(Model model)
    {
        Account account=new Account();
        model.addAttribute("accounts",account);
        return "withdraw";
    }

    //show deposite form
    @GetMapping("/withdraw1")
    public String depositeForm(Model model)
    {
        Account account=new Account();
        model.addAttribute("accounts",account);
        return "deposite";
    }

    //withdraw amount
    @PostMapping("/withdepo")
    public String withdraw(@ModelAttribute("accounts") Account account)
    {
        service.withdrawAmmount(account);
        return "redirect:/";
    }

    //deposite amount
    @PostMapping("/withdepo1")
    public String deposite(@ModelAttribute("accounts") Account account)
    {
        service.depositeAmmount(account);
        return "redirect:/";
    }
}
