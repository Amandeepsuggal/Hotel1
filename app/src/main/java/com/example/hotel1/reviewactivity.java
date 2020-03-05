package com.example.hotel1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reviewactivity extends AppCompatActivity {

    Button bb1,bb2,bb3,bb4;
    Intent i;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewactivity);
        bb1 = findViewById(R.id.button2);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(reviewactivity.this, searchhotelactivity.class);
            }
        });
    }
}
