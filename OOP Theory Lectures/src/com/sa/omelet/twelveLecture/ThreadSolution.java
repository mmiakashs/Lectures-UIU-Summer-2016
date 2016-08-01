package com.sa.omelet.twelveLecture;

/**
 * Created by akashs on 7/25/16.
 */
public class ThreadSolution {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("MainClassThread");

        System.out.println("Thread details: " + t);
        MyThread m1 = new MyThread("First");
        m1.th.start();
        MyThread m2 = new MyThread("Second");
        m2.th.start();
        try {
            for (int i = 15; i >= 0; i--) {
                System.out.println("Main " + i);
                    Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
        System.out.println("Main thread finish");
    }
}
