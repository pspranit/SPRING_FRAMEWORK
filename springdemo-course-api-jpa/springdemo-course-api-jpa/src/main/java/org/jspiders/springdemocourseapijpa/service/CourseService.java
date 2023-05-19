package org.jspiders.springdemocourseapijpa.service;

import org.jspiders.springdemocourseapijpa.model.Course;
import org.jspiders.springdemocourseapijpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;


    ////////////////////////REST Controller/////////////////////////////////
    public void addCourses(Course c) {
        repository.save(c);
    }

    public List<Course> getAllCourses() {
        List<Course> data=repository.findAll();
        return data;
    }

    public Course getSingleCourse(int id)
    {
        Course c=null;
        for(Course course: repository.findAll())
        {
            if(course.getCourseId()==id)
            {
                c=course;
            }
        }

        return c;
    }

    public void updateCourses(Course c) {
//        repository.findAll().forEach(e->{
//            if(e.getCourseId()==c.getCourseId())
//            {
//                e.setBatchCode(c.getBatchCode());
//                e.setCourseSub(c.getCourseSub());
//            }
//        });
        repository.save(c);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
//        Course course=repository.getOne(id);
//        repository.delete(course);
    }

}
