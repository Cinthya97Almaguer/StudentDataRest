package edu.itq.soa.repository;

import org.springframework.data.repository.CrudRepository;

import edu.itq.soa.dto.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
