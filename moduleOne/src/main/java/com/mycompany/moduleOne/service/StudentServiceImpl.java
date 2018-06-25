package com.mycompany.moduleOne.service;

import com.mycompany.moduleOne.model.Student;
import org.springframework.stereotype.Component;

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
