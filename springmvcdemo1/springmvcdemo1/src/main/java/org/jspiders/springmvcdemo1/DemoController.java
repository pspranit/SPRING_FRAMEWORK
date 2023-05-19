package org.jspiders.springmvcdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    List<Store> storeList=new ArrayList<>();

    {
        storeList.add(new Store("TABLE",1500.25,15000.25));
        storeList.add(new Store("AC",25000.25,30000.25));
        storeList.add(new Store("IRON",1000.25,900.25));
    }
    @GetMapping("/")  //url
    public String getMessage()
    {
        return "welcome";
    }

    @GetMapping("/aboutus")
    public String getStoreInfo(Model model)
    {
        model.addAttribute("records",storeList);
        return "aboutus";
    }

    //Show form
    @GetMapping("/addproduct")
    public String getProductForm(Model model)
    {
        model.addAttribute("store", new Store());
        return "productform";
    }

    //this method will add new object into list
    @PostMapping("/saveproduct")
    public String insertProduct(Store store)
    {
     storeList.add(store);
     return "redirect:/aboutus";
    }

    @GetMapping("/portfolio")
    public String getPortfolio(Model model)
    {
        List<Project> projectList=new ArrayList<>();
        projectList.add(new Project(1,"ECOMMERCE","SPRING"));
        projectList.add(new Project(2,"ECOMMERCE","JDBC"));
        projectList.add(new Project(3,"ECOMMERCE","HIBERNATE"));

        model.addAttribute("projects",projectList);
        return "portfolio";
    }
}
