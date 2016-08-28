package com.sa.omelet.twentyLecture;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by akashs on 8/17/16.
 */
public class ObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fout = new FileOutputStream("objectFile");
        ObjectOutputStream objectOut = new ObjectOutputStream(fout);
        objectOut.writeObject(new Student("Anik", 3.98, 25));
        objectOut.flush();
        objectOut.close();

        FileInputStream fin = new FileInputStream("objectFile");
        ObjectInputStream objectIn = new ObjectInputStream(fin);
        Student student = (Student) objectIn.readObject();
        System.out.println(student.getName()+" "+student.getCgpa());
        objectIn.close();

        int n=10;
        Integer integer = new Integer(n);
        Double d=25.26;
        double dd = d;
        System.out.println(integer);

        ArrayList<Integer> a = new ArrayList();
        a.add(50);
        a.add(70);
        a.add(15);
        a.add(13);

        for(int i=0;i<a.size();i++){
            int temp = a.get(i);
            System.out.println(temp);
        }




    }
}
