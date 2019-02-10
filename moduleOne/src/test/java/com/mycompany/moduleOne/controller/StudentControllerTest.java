package com.mycompany.moduleOne.controller;

import com.mycompany.moduleOne.entity.StudentEntity;
import com.mycompany.moduleOne.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    StudentRepository studentRepository;

    @Test
    public void testGetStudentController() throws Exception{
        StudentEntity se = new StudentEntity();
        se.setId(1);
        se.setFirstName("Grinish");
        se.setLastName("Nepal");
        when(studentRepository.findById(se.getId())).thenReturn(java.util.Optional.ofNullable(se));

        mockMvc.perform(get("/student/1").contentType(APPLICATION_JSON)).andExpect(status().is2xxSuccessful());

        Mockito.verify(studentRepository, Mockito.times(1)).findById(1L);
    }
}

