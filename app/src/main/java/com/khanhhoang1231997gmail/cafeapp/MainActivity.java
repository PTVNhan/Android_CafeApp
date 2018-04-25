package com.khanhhoang1231997gmail.cafeapp;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButtonDecaf, radioButtonColumbian, radioButtonExpresso;
    CheckBox cbSugar, cbCream;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rGroup = (RadioGroup)findViewById(R.id.rGroup);
        radioButtonDecaf = (RadioButton)findViewById(R.id.radioButton);
        radioButtonColumbian = (RadioButton)findViewById(R.id.radioButton2);
        radioButtonExpresso = (RadioButton)findViewById(R.id.radioButton3);

        cbCream = (CheckBox)findViewById(R.id.checkBox);
        cbSugar = (CheckBox)findViewById(R.id.checkBox2);

        bt = (Button)findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if (radioButtonDecaf.isChecked())
                    s += "Decaf";
                else if (radioButtonColumbian.isChecked())
                    s += "Columbian";
                else
                    s += "Expresso";

                /*int idm = radioGroup.getCheckedRadioButtonId();
                switch (idm){
                    case R.id.radioButton:
                        s += "Decaf";
                        break;
                    case R.id.radioButton2:
                        s += "Columbian";
                        break;
                    case R.id.radioButton3:
                        s += "" +
                                "0Expresso";
                        break;
                }*/
                s += " Coffee";
                if (cbCream.isChecked()){
                    s+= " & Cream";
                }
                if (cbSugar.isChecked()){
                    s += " & Sugar";
                }
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }
        });
    }
}