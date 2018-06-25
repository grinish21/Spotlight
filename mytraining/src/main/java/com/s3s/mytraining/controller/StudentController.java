package com.s3s.mytraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.s3s.mytraining.model.Student;
import com.s3s.mytraining.service.StudentService;
import com.s3s.mytraining.service.StudentServiceImpl;

@RestController
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("/getstudent")
    public @ResponseBody
    Student getStudentDetails(
            @RequestParam(name = "id", required = true, defaultValue = "0") Long id) {

        return studentService.getStudentDetails(id);
    }

    // Example Response Entity
    @RequestMapping(value = "/getstudent1", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentDetailsTest(
            @RequestParam(name = "id", required = true, defaultValue = "0") long id) {
        if (id == 0) {
            return ResponseEntity.badRequest().body(new Student());
        }

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("myname");
        s1.setStandard("33");
        return ResponseEntity.ok().body(s1);
    }
}
