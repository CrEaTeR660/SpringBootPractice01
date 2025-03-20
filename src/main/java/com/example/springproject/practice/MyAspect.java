//package com.example.springproject;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
////@Aspect是切面(把共同邏輯寫在裡面)
//// @Aspect+@Component搭配
//@Aspect
//@Component
//public class MyAspect {
//    //統一交給切面處理
//@Around("execution(* com.example.springproject.HpPrinter.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//    System.out.println("I'm before");
//    joinPoint.proceed();
//    System.out.println("I'm after");
//}
////在執行切入點之前先執行以下的程式
////    @Before("execution(* com.example.springproject.HpPrinter.*(..))" )
////    public void before(){
////        System.out.println("I'm before");
////    }
////在執行切入點之後執行以下的程式
////    @After("execution(* com.example.springproject.HpPrinter.*(..))")
////    public void   after(){
////        System.out.println("I'm after");
////    }
//}
