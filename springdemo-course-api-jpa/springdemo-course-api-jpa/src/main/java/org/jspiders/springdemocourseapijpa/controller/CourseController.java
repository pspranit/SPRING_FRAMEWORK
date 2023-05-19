package org.jspiders.springdemocourseapijpa.controller;

import org.jspiders.springdemocourseapijpa.model.Course;
import org.jspiders.springdemocourseapijpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class CourseController {
    @Autowired
    private CourseService service;

    //add course
    @PostMapping("/courses")
    public void addCourse(@RequestBody Course c)
    {
        service.addCourses(c);
    }

    //display all courses
    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        List<Course> data=service.getAllCourses();
        return data;
    }
    //Display Single Course
    @GetMapping("/courses/{id}")
    public Course getSingleCourse(@PathVariable(value = "id") int id)
    {
        Course c=service.getSingleCourse(id);
        return c;
    }

    //update course
    @PutMapping("/courses")
    public void updateCourses(@RequestBody Course c)
    {
        service.updateCourses(c);
    }

    //delete course
    @DeleteMapping("/courses/{id}")
    public void deleteCourses(@PathVariable(value = "id") int id) {
        service.deleteById(id);
    }

//        @DeleteMapping("/courses/{id}")
//         public ResponseEntity<HttpStatus> deleteCourses(@PathVariable(value = "id") String id)
//        try{
//            service.deleteById(Integer.parseInt(id));
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
}
