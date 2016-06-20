package com.sa.omelet.seventhLecture;

/**
 * Created by akashs on 6/20/16.
 */
public class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double calArea() {
        double area = dim1*dim2/2.0;
        return area;
    }

}
