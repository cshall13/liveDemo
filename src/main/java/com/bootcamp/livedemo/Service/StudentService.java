package com.bootcamp.livedemo.Service;

import com.bootcamp.livedemo.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    //creating and initializing an array list called studentList
    //List<> is the interface for creating lists or types of lists. Inside the <>'s is what is going into the list
    private List<Student> studentList = new ArrayList<>();

    public StudentService() {

        //this is initializing the student constructor and calling it student1 then setting the attributes for the new student(s)
        Student student1 = new Student();
        student1.setName("Shahar");
        student1.setAge(26);
        Student student2 = new Student("Victor", 25);
        Student student3 = new Student("Noelle", 24);
        Student student4 = new Student("Mariano", 23);

        //adding students to the student list created above
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

    }

    //the return type of this method is a list of students and the method name is getStudentList
    public List<Student> getStudentList() {
        return studentList;

    }
}
