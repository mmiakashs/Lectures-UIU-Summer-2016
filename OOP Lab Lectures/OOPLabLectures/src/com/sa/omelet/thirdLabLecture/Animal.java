package com.sa.omelet.thirdLabLecture;

/**
 * Created by akashs on 6/14/16.
 */
public class Animal {

    public String name;
    public String id;

    public Animal(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Animal(){
        System.out.println("Animal default cons");
    }
}
