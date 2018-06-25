package com.mycompany.moduleOne.service;

import com.mycompany.moduleOne.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	public Student getStudentDetails(Long id);
}
