package com.dockersample.app.controller;

import com.dockersample.app.model.Student;
import com.dockersample.app.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @GetMapping("/getlist")
    public List<Student> getStudentList() {
        return studentImpl.getList();
    }

    @PostMapping("/addtolist")
    public List<Student> addToStudentList(@RequestParam int id, @RequestParam String name, @RequestParam String course) {
        return studentImpl.addToList(id, name, course);
    }
}
