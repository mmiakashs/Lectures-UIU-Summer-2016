package com.sa.omelet.sixthLecture;

/**
 * Created by akashs on 6/13/16.
 */
public class SixthLectureSolution {

    public static void main(String arg[]){
        /*
        Cube c = new Cube(10,5,12);
        c.showInfo();
        System.out.println(c.calVolume());
        */
        Cube cube = new Cube(10,15,2,"0125152");

        System.out.println(cube.calVolume());

        Box box = new Cube(10,15,2,"0125428");
        cube.showInfo();
        box.showInfo();


        CubeCost cs = new CubeCost();
        //cs.depth=10;
        cs.height=10;
        cs.width=1;
        cs.cost = 5;
        System.out.println(cs.calCubeCost());
    }

}
