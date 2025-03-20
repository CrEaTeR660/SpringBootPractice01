//package com.example.springproject.dao;
//
//import com.example.springproject.model.StudentVO;
//import com.example.springproject.mapper.StudentRowmapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository//將這個class變成bean，可以被注入；這一層是去跟資料庫溝通
//public class StudentDaoImpl implements StudentDao {
//
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    //單一搜尋
//    @Override
//    public StudentVO getById(Integer studentId) {
//        //使用query()方法
//        String sql = "select  id, name from student where id = :studentId";
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("studentId", studentId);
//
//        List<StudentVO> list = namedParameterJdbcTemplate.query(sql, map, new StudentRowmapper());
//
//        if (list.size() > 0) {  //去取得list中第一個object，當以後要去取得list裡的數據要先確認裡面有沒有東西，再去get
//            return list.get(0);
//        } else {
//            return null;
//        }
//    }
//
//    //新增一名學生
//    @Override
//    public void addById(StudentVO student) {
//        String sql = "INSERT INTO student(name) VALUE (:studentName)";
//        //值加上冒號，代表動態的
//        //因為要動態寫法，用map
//        Map<String, Object> map = new HashMap<>();
//        map.put("studentName", student.getName());//前端所傳進來Id的值
//
//        KeyHolder keyHolder = new GeneratedKeyHolder();
//        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);
//
//        int id = keyHolder.getKey().intValue();
//        System.out.println("MySql自動生成的ID為" + id);
//
//    }
//
//    //新增多筆學生
//    @Override
//    public void addManyById(List<StudentVO> studentList) {
//        String sql = "Insert into student(name) value(:studentName)";
//
//        MapSqlParameterSource[] parameterSources = new MapSqlParameterSource[studentList.size()];
//
//        for (int i = 0; i < studentList.size(); i++) {
//            StudentVO student = studentList.get(i);
//
//            parameterSources[i] = new MapSqlParameterSource();
//            parameterSources[i].addValue("studentName", student.getName());
//        }
//        namedParameterJdbcTemplate.batchUpdate(sql, parameterSources);
//
//
//    }
//
//    @Override
//    public void deleteById(Integer studentId) {
//
//        String sql = "DELETE FROM student WHERE id = :studentId";
//        Map<String, Object> map = new HashMap<>();
//
//        map.put("studentId", studentId); //透過url接到到前端傳來的數據
//
//        namedParameterJdbcTemplate.update(sql, map);
//
//
//    }
//}
//
