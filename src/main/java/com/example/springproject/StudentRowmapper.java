package com.example.springproject;


import com.example.springproject.model.StudentVO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowmapper implements RowMapper<StudentVO> {
    @Override
    public StudentVO mapRow(ResultSet resultSet, int i) throws SQLException {//resultSet拿到資料庫的資料，i是取的每一個的參數

//        //從資料庫取得數據
//        Integer a = resultSet.getInt("id");
//        String b = resultSet.getString("name");
//
//        //將數據轉為java Object
//        Student student = new Student();
//        student.setId(a);
//        student.setName(b);

        //第二種寫法
        StudentVO student= new StudentVO();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        return student;
    }
}
