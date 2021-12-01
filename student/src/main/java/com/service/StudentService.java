package com.service;

import com.entity.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public List<Student>getAllStudent(){
        return repository.findAll();
    }

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(long id){
        Optional<Student> student = repository.findById(id);
        if (student.isPresent()){
        return student.get();
        }
        return null;
    }

    public void deleteStudent(long id){
         repository.deleteById(id);
    }
}
