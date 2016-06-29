package com.sa.omelet.tenthLecture;

import java.util.Scanner;

/**
 * Created by akashs on 6/29/16.
 */
public class Solution {

    static int fun(int a, int b){
        int r=12457932;
        int[] array = new int[5];
            if(a>1000){
                throw new NullPointerException("hello");
            }
            r = a / b;
            array[r]=10;
        return array[r];

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res=123;
        try{
            res=fun(a,b);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array out of index");
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
