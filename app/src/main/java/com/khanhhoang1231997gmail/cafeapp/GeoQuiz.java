package com.khanhhoang1231997gmail.cafeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz);
        Button btTrue,btFalse;
        String [] Question = {"Khanh Hoang dep trai?" , "Khanh Hoang hoc gioi?"};
        //find
        btTrue = (Button) findViewById(R.id.btTrue);
        btFalse = (Button)findViewById(R.id.btFalse);
        btFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.incorect,Toast.LENGTH_LONG).show();
            }
        });
        btTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),R.string.correct,Toast.LENGTH_LONG).show();
            }
        });
    }
}
