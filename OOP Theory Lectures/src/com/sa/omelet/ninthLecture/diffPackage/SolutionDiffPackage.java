package com.sa.omelet.ninthLecture.diffPackage;

import com.sa.omelet.ninthLecture.samePackage.Parent;

import static com.sa.omelet.ninthLecture.diffPackage.SolutionDiffPackage.fun;

/**
 * Created by akashs on 6/27/16.
 */
public class SolutionDiffPackage extends Parent{
    public static void main(String arg[]){
        SolutionDiffPackage parent = new SolutionDiffPackage();
        Parent parent1 = new Parent();
        fun(parent);
    }

    public static void fun(Object object){
        if(object instanceof SolutionDiffPackage){
            Class c = object.getClass();
            System.out.println(c.getName());
        }
        else{
            System.out.println("parent");
        }

    }
}
