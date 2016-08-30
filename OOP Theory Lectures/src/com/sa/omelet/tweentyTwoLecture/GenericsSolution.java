package com.sa.omelet.tweentyTwoLecture;

/**
 * Created by akashs on 8/24/16.
 */
public class GenericsSolution {

    public static <M> void printArray(M[] a){
        M res;
        for(M n: a){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static <M extends Comparable<M> > M getMax(M a, M b, M c){
        if(a.compareTo(b)>0){
            if(a.compareTo(c)>0){
                return a;
            }
            return c;
        }
        else if(b.compareTo(c)>0){
            return b;
        }
        return c;
    }


    public static void main(String[] args) {
        Integer[] a = {1, 5, 10, 7, 9};
        Double[] d = {2.5, 5.7, 10.9, 5.7, 3.9};
        printArray(a);
        printArray(d);
        
        GenericStudent<Integer> gn = new GenericStudent(10);
        Integer n = gn.getMarks();
    }
}

class GenericStudent<M>{
        M marks;
    GenericStudent(M marks){
        this.marks = marks;
    }

    public M getMarks() {
        return marks;
    }
}







