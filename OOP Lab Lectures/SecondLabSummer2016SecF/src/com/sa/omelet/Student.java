package com.sa.omelet;

/**
 * Created by akashs on 6/7/16.
 */
public class Student {
    private String studentName;
    private String studentId;

    public Student(){
        System.out.println("Hello Constructor");
    }

    public Student(String studentName, String studentId) {
        studentName = studentName;
        studentId = studentId;
    }

}
