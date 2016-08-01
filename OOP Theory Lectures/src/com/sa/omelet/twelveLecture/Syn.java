package com.sa.omelet.twelveLecture;

/**
 * Created by akashs on 7/27/16.
 */
public class Syn {
    public int count =0;
    public int t=0;

    public synchronized void add(){
        t++;
        if(t==2){
            notify();
        }
    }

    public void check() throws InterruptedException {
        if(t!=2){
            wait();
        }
    }
}
