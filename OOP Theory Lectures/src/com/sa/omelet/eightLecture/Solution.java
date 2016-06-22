package com.sa.omelet.eightLecture;

/**
 * Created by akashs on 6/22/16.
 */
public class Solution {

    private int num=10;

    public void nonMain(String argv[]){
        Solution s = new Solution();
        s.test();
    }

    public void test(){

        Inner inner = new Inner();
        inner.showMessage();

    }

    public class Inner{
        public void showMessage(){
            System.out.println("Inner class "+num);
        }
    }
}
