package com.omeletlab.sa.recycleviewfourthclass;

/**
 * Created by akashs on 6/22/16.
 */
public class Student {
    private String studentName;
    private String studentID;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
