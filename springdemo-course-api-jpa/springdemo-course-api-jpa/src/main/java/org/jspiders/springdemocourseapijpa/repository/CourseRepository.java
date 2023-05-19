package org.jspiders.springdemocourseapijpa.repository;

import org.jspiders.springdemocourseapijpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

}
