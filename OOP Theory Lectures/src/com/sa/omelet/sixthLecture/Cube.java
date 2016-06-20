package com.sa.omelet.sixthLecture;

/**
 * Created by akashs on 6/13/16.
 */
public class Cube extends Box {

    public String id;
    public double width;

    public Cube(){
        System.out.println("Cube cons");
    }

    public Cube(double width, double h, double d, String id) {
        super(width,h,d);
        this.width = 0;
        this.id = id;
    }
    public double calVolume(){
        return this.width*height;
    }

    public String toString(){
        String str = "Cube class to String "+width+" "+height;
        str+= super.toString();

        return str;
    }
    public void showInfo(){
        System.out.println("Cube "+width+" "+height+" "+depth);
    }

}
