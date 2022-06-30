package com.example.simplerestjson.Services;

import com.example.simplerestjson.Entitites.Student;

public class StudentServices {
    public static Student getTestStudent() {
        Student student = new Student("Toni", "antoniu.pitic@ulbsibiu.ro");
        return  student;
    }
}
