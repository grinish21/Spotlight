package com.s3s.mytraining.service;

import org.springframework.stereotype.Component;

import com.s3s.mytraining.model.Student;
@Component
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentDetails(Long id) {
		Student student = new Student();
		student.setId(id);
		if (id > 0 && id < 10) {
			student.setName("less than 10");
			student.setName("not more than 10");
		} else {
			student.setName("more than 10");
			student.setName("definatley more than 10");
		}

		return student;
	}

}
