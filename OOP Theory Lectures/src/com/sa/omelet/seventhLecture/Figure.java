package com.sa.omelet.seventhLecture;

/**
 * Created by akashs on 6/20/16.
 */
public abstract class Figure {
    public double dim1;
    public double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void showInfo(){
        System.out.println("Fig show info");
    }

    public abstract double calArea();

    public Figure(){}
}
