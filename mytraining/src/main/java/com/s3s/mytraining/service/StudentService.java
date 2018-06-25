package com.s3s.mytraining.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.s3s.mytraining.model.Student;

@Service
public interface StudentService {

	public Student getStudentDetails(Long id);
}
