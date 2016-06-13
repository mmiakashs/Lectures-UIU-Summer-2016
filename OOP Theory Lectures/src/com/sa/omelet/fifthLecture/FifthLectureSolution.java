package com.sa.omelet.fifthLecture;

/**
 * Created by akashs on 6/13/16.
 */
public class FifthLectureSolution {

    public static void main(String arg[]){
        /*
        Cube c = new Cube(10,5,12);
        c.showInfo();
        System.out.println(c.calVolume());
        */
        CubeCost cs = new CubeCost();
        cs.depth=10;
        cs.height=10;
        cs.width=1;
        cs.cost = 5;
        System.out.println(cs.calCubeCost());
    }

}
