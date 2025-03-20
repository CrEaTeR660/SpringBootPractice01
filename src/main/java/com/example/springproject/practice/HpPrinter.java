//package com.example.springproject;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
////當我@Component，spring容器會幫我創建bean hpPinter
////implements InitializingBean 會幫你的bean初始化
//
//@Component
//public class HpPrinter implements Printer{
//
//    @Override
//    public void print(String message) {
//        System.out.println("HP印表機: " + message);
//    }
////   @Value("${printer.name}")
////    private String name; //會去設定檔(application.properties)找printer.name
////
////    //預設0，儲存印表機次數
////    @Value("${printer.count:20}") //會去把設定檔裡的值 拿過來
//    private int count;
//
//
//    //配合implements InitializingBean
//    //@Override
//    //public void afterPropertiesSet() throws Exception {
//
//    //}
//    //這個註解幫他初始化 count的值
//    //修飾詞public ，只能是void ，不能給參數，方法名隨 意取
//    @PostConstruct
//    public void initialize() {
//        count = 5;
//    }
//
////    @Override
////    public void print(String message) {
////        count--;
////        System.out.println(name+":"+message);
////        System.out.println("剩餘使用次數:"+count);
////    }
//}
