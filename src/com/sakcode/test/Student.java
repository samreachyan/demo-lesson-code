package com.sakcode.test;

public class Student {
    private int id;
    private String name;
    public String address;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
