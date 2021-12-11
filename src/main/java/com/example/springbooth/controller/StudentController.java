package com.example.springbootthymeleaf.controller;


import com.example.springbootthymeleaf.model.Student;
import com.example.springbootthymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    // home page
    @GetMapping("/index") // usr call index --> show students
    public String displayStudents(ModelMap modelMap) {
        modelMap.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    // registration form
    @GetMapping("/register-student") // register-student
    public String registerStudentForm(Student student) { // submit button - action -> addStudent(Student (user inputs))
        return "register-student";
    }

    // backend: add student
    @PostMapping("/addstudent")
    public String addStudent(@Valid Student student, BindingResult bindingResult, ModelMap modelMap) {
        modelMap.addAttribute("student", student);
        if (bindingResult.hasErrors()) {
            return "register-student";
        }
        studentRepository.save(student);
        return "redirect:/index";
    }
}

