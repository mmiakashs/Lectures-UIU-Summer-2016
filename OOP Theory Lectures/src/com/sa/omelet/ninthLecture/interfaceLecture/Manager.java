package com.sa.omelet.ninthLecture.interfaceLecture;

import com.sa.omelet.seventhLecture.Figure;

/**
 * Created by akashs on 6/27/16.
 */
public class Manager extends Figure implements TeamLeader {

    @Override
    public double calArea() {
        return 0;
    }

    @Override
    public void teamLeaderRes() {
        System.out.println(a+" "+d);
    }

    @Override
    public void companyName() {

    }

    interface innerIn{
        public  void demo(String s);
    }

    public class InnerClass implements innerIn{

        @Override
        public void demo(String s) {

        }
    }
}
