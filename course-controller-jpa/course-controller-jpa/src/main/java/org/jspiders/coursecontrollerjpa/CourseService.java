package org.jspiders.coursecontrollerjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    //display courses
    public List<Course> displayCourses() {
        List<Course> data=repository.findAll();
        return data;
    }

    //add course
    public void submitCourseDetails(Course c) {
        repository.save(c);
    }

    public void deleteCourse(int id) {
        repository.deleteById(id);
    }
}