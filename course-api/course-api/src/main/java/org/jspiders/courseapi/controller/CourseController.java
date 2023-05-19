package org.jspiders.courseapi.controller;

import org.jspiders.courseapi.model.Course;
import org.jspiders.courseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("/courses")
    public List<Course> displayAllCourses()
    {
        List<Course> data=service.displayAllCourses();
        return data;
    }

    @GetMapping("/courses/{code}")
    public List<Course> getCourseBasedOnBatchCode(@PathVariable(value = "code") int code)
    {
        List<Course> data=service.getCourseBasedOnBatchCode(code);
        return data;
    }

    @GetMapping("/faculties")
    public List<String> getAllNameOfFaculties()
    {
        List<String> data=service.getAllNameOfFaculties();
        return data;
    }

    @GetMapping("/allbatchcode/{faculty}")
    public Set<Integer> getAllBatchCodeOfSpecificFaculty(@PathVariable(value = "faculty") String faculty)
    {
        Set<Integer> data=service.getAllBatchCodeOfSpecificFaculty(faculty);
        return data;
    }

    @GetMapping("/morethan")
    public List<Course> allBatchesMoreThan50()
    {
        List<Course> data=service.allBatchesMoreThan50();
        return data;
    }

    @PostMapping("/addcourse")
    public void addEmployee(@RequestBody Course c)
    {
        service.addCourse(c);
    }

    @DeleteMapping("/delete/{code}")
    public void deleteSpecificDetails(@PathVariable(value = "code") int code)
    {
        service.deleteSpecificDetails(code);
    }
}
