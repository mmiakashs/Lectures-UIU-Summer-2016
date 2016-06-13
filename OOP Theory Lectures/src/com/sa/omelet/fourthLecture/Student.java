package com.sa.omelet.fourthLecture;

/**
 * Created by akashs on 6/7/16.
 */
public class Student {
    private String studentName;
    private String studentId;

    public Student(){
        System.out.println("Hello Constructor");
    }

    public Student(String studentname, String studentid) {
        studentName = studentname;
        studentId = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    protected void finalize() {
        System.out.println(studentName+" die");
    }
}
