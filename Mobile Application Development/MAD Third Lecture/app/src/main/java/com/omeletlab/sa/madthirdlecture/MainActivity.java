package com.omeletlab.sa.madthirdlecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button increaseBtn = (Button) findViewById(R.id.increaseBtn);
        final EditText inputEt = (EditText) findViewById(R.id.inputAmountET);
        Button calculateBtn = (Button) findViewById(R.id.calculateBtn);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEt.getText().toString();
                if(input.isEmpty() || input==null){
                    input="0";
                }
                int num = Integer.parseInt(input)*80;

                Intent in =new Intent(MainActivity.this, ResultActivity.class);
                in.putExtra("cur", num);
                startActivity(in);
            }
        });

        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Button click", "increase button click");
                Toast.makeText(MainActivity.this, "increase button click", Toast.LENGTH_LONG).show();

                String input = inputEt.getText().toString();
                if(input.isEmpty() || input==null){
                    input="0";
                }
                int num = Integer.parseInt(input);
                num+=1;

                inputEt.setText(String.valueOf(num));
            }
        });
    }
}
