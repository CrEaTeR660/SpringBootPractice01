package com.example.springproject.service;

import com.example.springproject.model.StudentVO;

import java.util.List;

public interface StudentService {
    //搜尋一名學生
    StudentVO getById(Integer studentId);
    //新增一名學生
    void addById(StudentVO student);
    //新增多位學生
    void addManyById(List<StudentVO> studentList);
    //刪除一名學生
    void deleteById(Integer studentId);
}
