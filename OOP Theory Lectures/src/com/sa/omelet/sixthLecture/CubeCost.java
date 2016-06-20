package com.sa.omelet.sixthLecture;

/**
 * Created by akashs on 6/13/16.
 */
public class CubeCost extends Cube {
    public double cost;

    public double calCubeCost(){
        return width*height*cost;
    }

    public CubeCost(){
        System.out.println("CubeCost Cons");
    }
}
