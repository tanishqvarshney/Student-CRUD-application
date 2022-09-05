package com.mycompany.service;

import com.mycompany.entity.Student;

import java.util.List;

public interface StudentService {
    public Integer saveStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudentById(Integer sno);

    public void deleteStudent(Integer sno);
}
