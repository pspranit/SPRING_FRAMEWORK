package org.jspiders.studentcontrollerjpa.StudentController;

import org.jspiders.studentcontrollerjpa.Model.Student;
import org.jspiders.studentcontrollerjpa.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("student",new Student());
        return "homepage";
    }
//    @GetMapping("/")
//    public String displayStudent(Model model)
//    {
//        List<Student> data=service.displayStudent();
//        model.addAttribute("student",data);
//        return "studentdata";
//    }
}
