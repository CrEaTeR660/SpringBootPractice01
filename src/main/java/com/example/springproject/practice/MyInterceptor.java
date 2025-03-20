//package com.example.springproject;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//@Component //創建一個beanClass給Spring
//public class MyInterceptor implements HandlerInterceptor {
//    //HandlerInterceptor是一個介面，執行攔截器，spring會預先執行preHandle方法
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //如果返回true他會通過，如果返回是false拒絕
//        System.out.println("執行MyInterceptor的攔截器方法");
//        response.setStatus(401);
//        return false;
//    }
//}
