package com.bootcamp.livedemo.Controller;


import com.bootcamp.livedemo.Model.Student;
import com.bootcamp.livedemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    //creates an instance of the StudentService class and names it studentService
            StudentService studentService;

    //specific to get requests
    @GetMapping("/students")
    //List of students is the value being returned and getStudents() is the name of the method
    public List<Student> getStudents() {
        //returns the getStudentList constructor from StudentService
        return studentService.getStudentList();

    }
}
