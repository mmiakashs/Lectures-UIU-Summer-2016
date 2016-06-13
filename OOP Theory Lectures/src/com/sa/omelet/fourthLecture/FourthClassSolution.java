package com.sa.omelet.fourthLecture;

public class FourthClassSolution {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student();
        student1.setStudentName("Anik");

        Student student2 = new Student("Safat", "0154125");

        System.out.println("Before Swap");
        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());

        swap(student1);
        System.out.println("After Swap");
        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());

    }

    public static void swap(Student st1){
        st1.setStudentName("Noman");

    }
}
