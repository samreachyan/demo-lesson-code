package com.sakcode.test;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(120);
        student.setName("Pheakdey");
        student.address ="Kandal";

        System.out.println(student);
        System.out.println(student.getId());
        System.out.println(student.getName());
//        System.out.println(student.getAddress());
        Student student1 = new Student();

        student1.setId(6);
        student1.setName("Chamnap");
        System.out.println(student1);
        System.out.println(student.getId() + " - " + student1.getName());

        Student stuentNtti = new Student(23);
        System.out.println(stuentNtti.getId());
    }
}
