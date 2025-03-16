//package com.example.springproject;
//
//import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class StudentController {
//    //Post方法是放在RequestBody去傳遞
//    @PostMapping("/students")
////    @RequestMapping(value = "/students", method = RequestMethod.GET) //效果一樣都是只能使用Httpmethod Get
//    public String create(@RequestBody @Valid  Student student) {
//        return "執行資料庫的Create 操作";
//    }
//
//    //Get方法是在路徑上
//    @GetMapping("/students/{studentId}")
//    public String read(@PathVariable Integer studentId) {
//        return "執行資料庫的Read 操作";
//    }
//
//    //Put方法是在url 去對哪個學生做更新，也要在request body去傳遞
//    @PutMapping("/students/{studentId}")
//    public String update(@PathVariable Integer studentId,
//                         @RequestBody Student student,
//                         @RequestHeader String info) {
//        return "執行資料庫的Update 操作";
//    }
//    //對哪個學生做刪除，只能放在url做傳遞，跟Get一樣
//    @DeleteMapping("/student/{studentId}")
//    public String delete(@PathVariable Integer studentId) {
//        return "執行資料庫刪除的操作";
//    }
//
//
//}
