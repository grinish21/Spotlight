package com.mycompany.moduleOne.entity;


import javax.persistence.*;

@Entity
@Table(name="teststudent")
public class TestStudent {

    @Id
    @GeneratedValue
    @Column(name="studentId")
    private Long id;

    @Column(name="firstName", length=50, nullable=false)
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
