package com.sa.omelet.eighteenLecture;

import java.io.*;

/**
 * Created by akashs on 8/8/16.
 */
public class Solution {

    public int a=20;
    public int b=20;

    public class Car{
        private int a;
        public void print(){
            final int a=50;
            System.out.println("Car a: "+Solution.this.a+" "+b);
        }
    }
    public static void main(String[] args) throws IOException {

        class RectBox{

        }
        //new Solution().sol();

//        FileInputStream in = new FileInputStream("in.txt");
//        FileOutputStream out = new FileOutputStream("out.txt");

//        FileReader in = new FileReader("in.txt");
//        FileWriter out = new FileWriter("out.txt");
//
//        int n;
//        while(true){
//            n = in.read();
//            if (n==-1) break;
//            out.write(n);
//        }
//        out.flush();
        //out.close();


        BufferedReader in = new BufferedReader(new FileReader("in.txt"));

        String s = in.readLine();
        System.out.println(s);

    }

    public void sol(){
        Car c = new Car();
        c.a=10;
        c.print();
    }

}



