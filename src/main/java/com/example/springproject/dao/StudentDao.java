package com.example.springproject.dao;

import com.example.springproject.model.StudentVO;

import java.util.List;

public interface StudentDao {
    //拿到一名學生
    StudentVO getById(Integer studentId);
    //增加一名學生
    void addById(StudentVO student);
    //一次增加很多學生
    void addManyById(List<StudentVO> studentList);
    //刪除一名學生
    void deleteById(Integer studentId);
}
