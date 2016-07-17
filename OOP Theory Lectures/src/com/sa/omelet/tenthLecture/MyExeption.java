package com.sa.omelet.tenthLecture;

/**
 * Created by akashs on 7/11/16.
 */
public class MyExeption extends Exception {

    String details;
    static int count;

    public MyExeption(String details){
        this.details = details;
        count++;
    }

    @Override
    public String toString() {
        return "My Exception: "+details+count;
    }
}
