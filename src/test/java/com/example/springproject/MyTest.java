package com.example.springproject;

import org.junit.jupiter.api.*;

public class MyTest {

    @BeforeEach
    public void beforeEach(){
        System.out.println("執行beforeEach");
    }

    @AfterEach
    @Test
    public void afterEach(){
        System.out.println("執行afterEach方法之後");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("執行BeforeAll方法");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("執行BeforeAll方法");
    }

    @Test
    public void test1(){
        System.out.println("執行test1");
    }


    @Test
    public void test2(){
        System.out.println("執行test2");
    }


}
