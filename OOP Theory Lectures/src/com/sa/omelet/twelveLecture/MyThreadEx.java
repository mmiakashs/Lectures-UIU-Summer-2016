package com.sa.omelet.twelveLecture;

/**
 * Created by akashs on 7/27/16.
 */
public class MyThreadEx extends Thread{

    private String name;
    private int s;
    private int e;
    private Syn syn;
    public MyThreadEx(String name, int s,int e, Syn syn) {
        super(name);
        this.name = name;
        this.s = s;
        this.e = e;
        this.syn =syn;
    }

    @Override
    public void run() {
        for (int i=s;i<=e;i++){
            if(i%3==0){
                synchronized (syn) {
                    syn.count++;
                }
            }
        }
//        synchronized (syn) {
//            syn.t++;
//        }
        syn.add();

    }
}






