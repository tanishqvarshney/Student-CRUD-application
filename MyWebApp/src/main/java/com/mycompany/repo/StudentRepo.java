package com.mycompany.repo;

import com.mycompany.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer> {
}
