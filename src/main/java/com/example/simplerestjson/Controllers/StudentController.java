package com.example.simplerestjson.Controllers;

import com.example.simplerestjson.Entitites.Student;
import com.example.simplerestjson.Services.StudentServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {
    @GetMapping("/getTestStudent")
    Student getTestStudent(){
        return StudentServices.getTestStudent();
    }
}
