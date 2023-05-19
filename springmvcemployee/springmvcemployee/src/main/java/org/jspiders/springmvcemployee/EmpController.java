package org.jspiders.springmvcemployee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpController {

    List<EmpDTO> list=new ArrayList<>();
    {
        list.add(new EmpDTO(1,"PRANIT",30000.00));
        list.add(new EmpDTO(2,"SHUBHAM",40000.00));
        list.add(new EmpDTO(3,"RUSHI",50000.00));
        list.add(new EmpDTO(4,"PAWAN",60000.00));

    }

    @GetMapping("/")
    public String getEmpInfo(Model model)
    {
        model.addAttribute("records",list);
        return "empHome";
    }

    @GetMapping("/addemployee")
    public String getEmpForm(Model model)
    {
        model.addAttribute("list",new EmpDTO());
        return "empform";
    }

    @PostMapping("/saveemp")
    public String insertEmployee(EmpDTO emp)
    {
        list.add(emp);
        return "redirect:/";
    }
}
