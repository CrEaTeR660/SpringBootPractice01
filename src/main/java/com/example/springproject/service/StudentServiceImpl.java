package com.example.springproject.service;

import com.example.springproject.model.StudentVO;
import com.example.springproject.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public StudentVO getById(Integer studentId) {
        return studentDao.getById(studentId);
        }

    @Override
    public void addManyById(List<StudentVO> studentList) {
         studentDao.addManyById(studentList);
    }

    @Override
    public void addById(StudentVO student) {
         studentDao.addById(student);
    }

    @Override
    public void deleteById(Integer studentId) {
         studentDao.deleteById(studentId);
    }
}
