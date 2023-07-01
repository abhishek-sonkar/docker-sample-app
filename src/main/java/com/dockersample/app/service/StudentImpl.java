package com.dockersample.app.service;

import com.dockersample.app.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImpl {
    List<Student> list;

    public StudentImpl() {
        list = new ArrayList<>();
        list.add(new Student(1,"Abhishek", "Spring Boot"));
        list.add(new Student(2, "Sonkar", "Docker"));
    }

    public List<Student> getList() {
        return list;
    }

    public List<Student> addToList(int id, String name, String course) {
        list.add(new Student(id, name,course));
        return list;
    }
}
