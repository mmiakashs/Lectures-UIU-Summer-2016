package com.sa.omelet.seventhLecture;

/**
 * Created by akashs on 6/20/16.
 */
public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }


    public void showInfo(){
        System.out.println("Rect Dimension "+dim1+" "+dim2);
    }

    @Override
    public double calArea() {
        return dim1*dim2;
    }
}
