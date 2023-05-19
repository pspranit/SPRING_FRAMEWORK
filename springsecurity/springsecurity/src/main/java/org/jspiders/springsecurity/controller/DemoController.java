package org.jspiders.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @GetMapping("/")
    public String getMessage()
    {
        return "<h1>welcome my app</h1>";
    }


    @GetMapping("/admin")
    public String getInfo()
    {
        return "<h1>welcome to admin app</h1>";
    }

    @GetMapping("/employee")
    public String getData()
    {
        return "<h1>welcome to employee app</h1>";
    }

}
