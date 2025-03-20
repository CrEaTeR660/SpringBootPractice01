//package com.example.springproject.controller;
//
//import com.example.springproject.model.StudentVO;
//import com.example.springproject.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class StudentController01 {
//
//    @Autowired//將bean注入進來
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    @Autowired//注入的時候，注入interface會比較好，降低跟impl的關聯性
//    private StudentService studentService;
//
//
//    //Insert方法
//    @PostMapping("/students")
//    public String insert(@RequestBody StudentVO student) {
//        studentService.addById(student);
//        return "執行 INSERT sql";
//
//    }
//
//    //如何新增批次資料
//    @PostMapping("/students/batch")
//    public String insertList(@RequestBody List<StudentVO> studentList) {  //前端會傳一段Student array過來
//         studentService.addManyById(studentList);
//        return "執行一批 Insert sql";
//
//    }
//
//
//    //delete方法
//    @DeleteMapping("/students/{studentId}")
//    public String delete(@PathVariable Integer studentId) {
//         studentService.deleteById(studentId);
//        return "執行delete方法";
//
//
//    }
//
//    //執行搜尋方法，
//    @GetMapping("/students/{studentId}")
//    //當我們將方法的返回類型改成使用自定義class，spring會幫我們轉json類型的數據
//    public StudentVO select(@PathVariable Integer studentId) {
//
//        return studentService.getById(studentId);
////        //queryForObject()方法，只能使用sql count，因返回值是一個Object物件
////        String countSql = "select count(*) from student";
////
////        Map<String, Object> countMap = new HashMap<>(); //取得sql語法中的變數
////        Integer count = namedParameterJdbcTemplate.queryForObject(countSql, countMap, Integer.class); //轉換成integer的變數
////        System.out.println("Student table的總數是" + count);
//
//
//    }
//}
//
//
