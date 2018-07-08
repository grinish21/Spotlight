package com.mycompany.moduleOne.controller;

import com.mycompany.moduleOne.entity.StudentEntity;
import com.mycompany.moduleOne.entity.TestStudent;
import com.mycompany.moduleOne.repository.StudentRepository;
import com.mycompany.moduleOne.repository.TestStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TestStudentRepository testStudentRepository;


    @PostMapping("/student")
    public StudentEntity createStudent(@Valid @RequestBody StudentEntity student) {
        return studentRepository.save(student);
    }

    @GetMapping("/student/{id}")
    public StudentEntity getNoteById(@PathVariable(value = "id") Long noteId) {
        return studentRepository.findById(noteId)
                .orElseThrow(() -> new RuntimeException("Cannot find student"));
    }


    @PostMapping("/testStudent")
    public TestStudent addStudent(@RequestBody TestStudent testStudent){

        return testStudentRepository.save(testStudent);
    }

    @GetMapping("/gettestStudent")
    public TestStudent getStudent (@RequestParam(name = "id", required = false, defaultValue = "1") Long id){
        return testStudentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find student"));

    }

}
