package org.jspiders.studentcontrollerjpa.StudentService;

import org.jspiders.studentcontrollerjpa.Model.Student;
import org.jspiders.studentcontrollerjpa.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> displayStudent() {
        return repository.findAll();
    }
}
