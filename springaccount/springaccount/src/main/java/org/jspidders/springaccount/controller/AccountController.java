package org.jspidders.springaccount.controller;

import org.jspidders.springaccount.model.Account;
import org.jspidders.springaccount.service.AccountService;
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


    @GetMapping("/addaccount")
    public String createAccountForm(Model model)
    {
        Account account=new Account();
        model.addAttribute("accounts",account);
        return "createaccount";
    }

    @PostMapping("/save")
    public String addAccount(@ModelAttribute("accounts") Account account)
    {
        service.addAccount(account);
        return "redirect::displayaccount";
    }


}
