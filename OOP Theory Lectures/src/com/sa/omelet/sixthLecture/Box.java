package com.sa.omelet.sixthLecture;

/**
 * Created by akashs on 6/13/16.
 */
// Parent class
public class Box {

    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(){
        System.out.println("Box Cons");
    }

    public void showInfo(){
        System.out.println("Box "+width+" "+height+" "+depth);
    }

}
