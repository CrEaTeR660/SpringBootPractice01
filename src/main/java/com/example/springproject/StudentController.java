package com.example.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public String insert(@RequestBody Student student) {
        //可以根據前端傳來的參數新增這筆數據
        studentRepository.save(student); //新增一筆新的資料到資料庫
        //save方法有新增跟更新
        return "執行資料庫的create操作";
    }

    @PutMapping("/student/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        //先去查資料庫裡的值
        Student s = studentRepository.findById(studentId).orElse(null);

        if (s != null) {
            s.setName(student.getName());//再去修改name的值
            studentRepository.save(s);

            return "執行資料庫Update的操作";

        } else {
            return "update 失敗，數據不存在";
        }
//        student.setId(studentId); //設定student Object裡的值，去檢查這個值存在嗎
//        studentRepository.save(student);//已經存在的話化去修改，沒存在會去新增
        //所以一定要先檢查這筆數據是否存在

    }

    @DeleteMapping("/student/{studentId}")
    public String delete(@PathVariable Integer studentId) {

        studentRepository.deleteById(studentId);
        return "執行資料庫delete的操作";
    }

    @GetMapping("/student/{studentId}")
    public Student read(@PathVariable Integer studentId) {

        Student student = studentRepository.findById(studentId).orElse(null);

        return student;
    }
}

