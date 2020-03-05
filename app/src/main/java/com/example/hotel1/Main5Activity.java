package com.example.hotel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {


    TextView t1,t2,t3,t4,t5;
    CheckBox  c1,c2,c3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1 = findViewById(R.id.button11);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent   i = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(i);

            }



        });
    }
}
