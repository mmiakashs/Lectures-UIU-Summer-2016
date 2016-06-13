package com.sa.omelet.fifthLecture;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by akashs on 6/13/16.
 */
// Parent class
public class Box {

    public double width;
    public double height;
    public double depth;

    public Box(){
        System.out.println("Box Cons");
    }

    public void showInfo(){
        System.out.println("Box "+width+" "+height+" "+depth);
    }

}
