package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    // display list of students
    @GetMapping("/")
    public String homepage(Model model) {
        List<Student> studentList = service.getAllStudent();
        model.addAttribute("student",studentList);
        return "index";
    }

    @GetMapping("/newStudentForm")
    public String showNewStudentForm( Student student,Model model){
    model.addAttribute("student",student);
    return "new_Student";
    }

    //save student in database
    @PostMapping("/saveStudent")
    public String addStudent(@ModelAttribute("student") Student student) {
        service.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable long id,Model model){
    Student student = service.getStudentById(id);
    model.addAttribute("student",student);
    return "update_student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id){
    service.deleteStudent(id);
    return "redirect:/";
    }
}
