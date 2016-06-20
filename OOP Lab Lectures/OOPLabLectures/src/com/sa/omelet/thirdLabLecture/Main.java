package com.sa.omelet.thirdLabLecture;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Bird bird = new Bird("x","y");
        Bird bird1 = new Bird("x","y");
        bird.showInfo();
        System.out.println(bird.toString());

        if(bird.equals(bird1)){
            System.out.println("match");
        }
    }
}
