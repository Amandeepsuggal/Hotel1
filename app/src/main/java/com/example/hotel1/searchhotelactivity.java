package com.example.hotel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class searchhotelactivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    EditText E1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchhotelactivity);

        b1 = findViewById(R.id.button9);
        b2 = findViewById(R.id.button8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent  i= new Intent(searchhotelactivity.this, Main5Activity.class);
                startActivity(i);

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  i= new Intent(searchhotelactivity.this, Main5Activity.class);
                startActivity(i);

            }



        });
    }
}

