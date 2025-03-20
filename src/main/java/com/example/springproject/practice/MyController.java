//package com.example.springproject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController //都是可以把class變成一個bean
//public class MyController {
//    //去尋找spring裡的bean
//     @Autowired
////    @Qualifier("canonPrinter") //這邊要找bean的名稱需打小寫
//    private Printer printer; //找到我要的bean注入到這裏的printer
//
//    @RequestMapping("/test")
//    public String test() {
//    printer.print("Hello World");
//        return "Hello World";
//    }
//}
