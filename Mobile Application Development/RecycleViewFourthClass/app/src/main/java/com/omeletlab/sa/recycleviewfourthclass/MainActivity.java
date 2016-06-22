package com.omeletlab.sa.recycleviewfourthclass;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        List<Student> students = new ArrayList();
        students.add(new Student("Anik", "011512481"));
        students.add(new Student("Safat", "011512481"));
        students.add(new Student("Ashis", "011512481"));

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        StudentAdapter studentAdapter = new StudentAdapter(students);
        rv.setAdapter(studentAdapter);





    }
}




