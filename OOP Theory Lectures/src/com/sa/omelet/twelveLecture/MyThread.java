package com.sa.omelet.twelveLecture;

/**
 * Created by akashs on 7/25/16.
 */
public class MyThread implements Runnable {

    private String name;
    public Thread th;

    public MyThread(String name) {
        this.name = name;
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+" "+i);
        }
    }
}
