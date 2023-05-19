package org.jspiders.coursecontrollerjpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping("/")
    public String displayCourses(Model model)
    {
        List<Course>data=service.displayCourses();
        model.addAttribute("records",data);
        return "course";
    }

    @GetMapping("/displaycourses")
    public String displayCourseFrom(Model model)
    {
        model.addAttribute("course",new Course());
        return "courseform";
    }

    @PostMapping("/insertcourse")
    public String submitCourseDetails(Course c)
    {
        service.submitCourseDetails(c);
        return "redirect:/";
    }

    //perform delete operation
    @DeleteMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable(value = "id") int id,Model model){
        service.deleteCourse(id);
        return "redirect:/";
    }



}

