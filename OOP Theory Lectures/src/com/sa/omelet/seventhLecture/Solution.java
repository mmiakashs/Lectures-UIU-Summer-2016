package com.sa.omelet.seventhLecture;

/**
 * Created by akashs on 6/20/16.
 */
public class Solution {

    public static void main(String argv[]){
        Figure fig;
        fig = new Rectangle(10,50);

        fig.showInfo();
        System.out.println("Rectangle Area "+fig.calArea());

        fig = new Triangle(10,50);
        fig.showInfo();
        System.out.println("Triangle Area "+fig.calArea());
//.
//        Figure fig1 = new Figure();
//        rectangle = fig1;
    }
}
