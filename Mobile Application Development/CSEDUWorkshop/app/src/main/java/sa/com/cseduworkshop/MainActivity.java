package sa.com.cseduworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeBtn = (Button) findViewById(R.id.clickMeBtn);
        textView = (TextView) findViewById(R.id.textview);
        Button secondButton = (Button) findViewById(R.id.anotherBtn);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(in);
            }
        });

        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = textView.getText().toString();
                temp = temp.toUpperCase();
                Log.i("converted string",temp);
                Toast.makeText(MainActivity.this, temp, Toast.LENGTH_LONG).show();
            }
        });


    }
}





