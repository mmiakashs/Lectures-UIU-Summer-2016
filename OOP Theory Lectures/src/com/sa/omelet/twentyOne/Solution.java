package com.sa.omelet.twentyOne;

import com.sa.omelet.twentyLecture.Student;

import java.io.*;
import java.util.*;

/**
 * Created by akashs on 8/22/16.
 */
public class Solution {
    public static void main(String[] args) {
        /*List<Integer> a = new Vector();
        a.add(50);
        a.add(70);
        a.add(15);
        a.add(13);

        Collections.sort(a);

        for(int i=0;i<a.size();i++){
            int temp = a.get(i);
            System.out.println(temp);
        }
        */

        Hashtable<String, Double> map = new Hashtable();
        map.put("Safat",3.85);
        map.put("Anik",3.70);

        map.put("Safat",3.90);


        System.out.println(map.get("Safat"));

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("anik", 3.90, 25));
        list.add(new Student("safat", 3.73, 21));
        list.add(new Student("imtiaz", 3.60, 20));

        Collections.sort(list);







    }
}
