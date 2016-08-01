package com.sa.omelet.twelveLecture;

/**
 * Created by akashs on 7/25/16.
 */
public class ThreadExSolution {
    public static void main(String[] args) {
        Syn s = new Syn();
        MyThreadEx m1 = new MyThreadEx("First", 1, 100, s);
        MyThreadEx m2 = new MyThreadEx("Second", 101, 200, s);

        m1.setPriority(Thread.NORM_PRIORITY + 3);
        m2.setPriority(Thread.NORM_PRIORITY - 3);

        m1.isAlive();
        try {
            m1.join();
            m2.join();

            m1.start();
            m2.start();

            for (int i = 5; i >= 0; i--) {
                System.out.println("Main " + i);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
        //System.out.println("Main thread finish");
        while(true){
            try {
                s.check();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread"+s.count);
    }
}
