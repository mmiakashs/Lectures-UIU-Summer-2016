package com.omeletlab.sa.fifthlecturesqliteandroid;



import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by akashs on 6/29/16.
 */



@Table(name = "ResturentTdb")
public class Restaurent extends Model {

    @Column(name = "restName", index = true)
    public String name;

    @Column(name = "loc")
    public String location;

    @Column(name = "cap")
    public int capacity;

    public Restaurent(){}

    public Restaurent(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }




}
