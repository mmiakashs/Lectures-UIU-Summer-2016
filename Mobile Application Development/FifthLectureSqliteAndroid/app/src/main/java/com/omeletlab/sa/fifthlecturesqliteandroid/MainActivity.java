package com.omeletlab.sa.fifthlecturesqliteandroid;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultTV = (TextView) findViewById(R.id.resultTV);
        SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = p.edit();

        String status = p.getString("DBS", "off");
        if(status.equals("off")) {
            Restaurent rest1 = new Restaurent("Pansi", "Shylet", 200);
            Restaurent rest2 = new Restaurent("Star", "Dhaka", 300);

            rest1.save();
            rest2.save();

            editor.putString("DBS", "on");
            editor.commit();1

        }

        List<Restaurent>restaurents = new Select().from(Restaurent.class).execute();

        String s="";
        for(Restaurent r : restaurents) {
            s+= r.name + " "+r.location+" "+r.capacity+"\n";
        }
        resultTV.setText(s);















    }
}
