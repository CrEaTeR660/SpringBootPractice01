package com.example.springproject;

import org.springframework.data.repository.CrudRepository;
//<,對應到參數型別>
public interface StudentRepository extends CrudRepository<Student, Integer> {



}
