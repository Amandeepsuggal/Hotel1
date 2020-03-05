package com.example.hotel1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginactivity extends AppCompatActivity {


    public class Main2Activity extends AppCompatActivity {
        Button b3, b4, b5;
        Intent i;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_loginactivity);

            b3 = findViewById(R.id.button11);
            b4 = findViewById(R.id.button3);
            b5 = findViewById(R.id.button5);



            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i = new Intent(loginactivity.this, signupactivity.class);
                    startActivity(i);

                }



            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i = new Intent(loginactivity.this, reviewactivity .class);
                    startActivity(i);

                }



            });
        }
    }
}

