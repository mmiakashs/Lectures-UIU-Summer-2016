package com.sa.omelet.fifthLecture;

/**
 * Created by akashs on 6/13/16.
 */
public class Cube extends Box {

    public Cube(){
        System.out.println("Cube cons");
    }

    public Cube(double w, double h, double d) {
        width = w;
        height = h;
        depth =d;
    }
    public double calVolume(){
        return width*height*depth;
    }
}
