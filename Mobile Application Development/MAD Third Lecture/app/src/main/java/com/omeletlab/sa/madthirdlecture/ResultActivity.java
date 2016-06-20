package com.omeletlab.sa.madthirdlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTV = (TextView) findViewById(R.id.showResult);
        int num = getIntent().getIntExtra("cur", 0);
        Log.d("hello",""+num);
        resultTV.setText(String.valueOf(num));

    }
}
