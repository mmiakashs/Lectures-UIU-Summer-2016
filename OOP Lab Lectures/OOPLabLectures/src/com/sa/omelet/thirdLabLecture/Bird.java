package com.sa.omelet.thirdLabLecture;

import java.util.Objects;

/**
 * Created by akashs on 6/14/16.
 */
public class Bird extends Animal {

    public Bird(String name, String id) {
        super(name, id);
    }

    public Bird(){
        System.out.println("Bird Default cons");
    }

    public void showInfo(){
        System.out.println(this.name+" "+id);
    }

    public String toString(){
        return "Bird"+name+" "+id+super.toString();
    }

    public boolean equals(Object b){
        Bird bird = (Bird) b;
        if(bird.id.equals(this.id)){
            return true;
        }
        return false;
    }
}
