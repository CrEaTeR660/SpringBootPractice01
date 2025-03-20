package com.example.springproject;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity //
@Table(name="student") //對應到資料庫student的表格
public class Student {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //自增主鍵
    @Column(name="id")
    Integer id;



    @Column(name="name")
    String name;

    public Student() {
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
