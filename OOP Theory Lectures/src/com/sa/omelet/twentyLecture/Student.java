package com.sa.omelet.twentyLecture;

import java.io.Serializable;

/**
 * Created by akashs on 8/17/16.
 */
public class Student implements Serializable, Comparable {
    private String name;
    private double cgpa;
    private int age;

    public Student(String name, double cgpa, int age) {
        this.name = name;
        this.cgpa = cgpa;
        this.age = age;
    }

    public Student() {    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        return this.name.compareTo(s.name);
    }







}
