package org.jspiders.courseapi.service;

import org.jspiders.courseapi.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CourseService {

    List<Course> courseList=new ArrayList<>();

    {
        courseList.add(new Course(101,"CORE JAVA","AKSHAY SIR",60));
        courseList.add(new Course(102,"SQL","EKTA MAM",40));
        courseList.add(new Course(103,"MANUAL","AYUSH SIR",60));
        courseList.add(new Course(104,"WEB TECH","SUDESH SIR",30));
    }


    public List<Course> displayAllCourses() {
        return courseList;
    }

    public List<Course> getCourseBasedOnBatchCode(int code) {

        List<Course> allCourse=new ArrayList<>();
        Course c1=null;
        for (int i=0;i<courseList.size();i++)
        {
             c1=courseList.get(i);
            if(c1.getBatchCode()==code)
            {
                allCourse.add(c1);
            }
        }
        return allCourse;
    }


    public List<String> getAllNameOfFaculties() {

        List<String> batchCode=new ArrayList<>();
        for (int i=0;i<courseList.size();i++)
        {
            Course course=courseList.get(i);
            batchCode.add(course.getFaculty());
        }
        return batchCode;
    }

    public Set<Integer> getAllBatchCodeOfSpecificFaculty(String faculty) {
        Set<Integer> batchCode = new HashSet<>();

        for (int i = 0; i < courseList.size(); i++) {
            Course c1 = courseList.get(i);
            if (c1.getFaculty().equalsIgnoreCase(faculty)) {
                batchCode.add(c1.getBatchCode());
            }
        }
        return batchCode;
    }

    public List<Course> allBatchesMoreThan50() {

        List<Course> allCourse=new ArrayList<>();

        Course c1=null;
        for (int i=0;i<courseList.size();i++)
        {
            c1=courseList.get(i);
            if(c1.getTotalClasses() > 50)
            {
                allCourse.add(c1);
            }
        }
        return allCourse;
    }

    public void addCourse(Course c) {
        courseList.add(c);
    }

    public void deleteSpecificDetails(int code) {
        for (int i=0;i<courseList.size();i++)
        {
           Course c1= courseList.get(i);
           if(c1.getBatchCode()==code)
           {
               courseList.remove(i);
           }
        }
    }
}
