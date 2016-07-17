package com.sa.omelet.tenthLecture;

import java.util.Scanner;

/**
 * Created by akashs on 6/29/16.
 */
public class Solution {

    static int fun(int a, int b)throws NullPointerException,
            ArithmeticException, ArrayIndexOutOfBoundsException
    {
        int r=12457932;
        int[] array = new int[5];
            try {
                if (a > 1000) {
                    throw new MyExeption("Value is over 1000, a ="+a);
                }
            }catch (MyExeption e){
                System.out.println(e);
            }
            r = a / b;
            array[r]=10;
        return array[r];

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int res = 123;
        try {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                try {
                    res = fun(a, b);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Array out of index");
                }
                System.out.println("executed without exeception");
            } catch (ArithmeticException e) {
                System.out.println("Math error");
            }
        }
        catch(Exception e){
            System.out.println("other exception occured"+e);
        }
        finally {
            System.out.println("Result"+res);
        }
        System.out.println("Successfully executed");
    }
}
