package com.example.hotel1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signupactivity extends AppCompatActivity {

    Button b1,b2;
    ConstraintLayout l1;

    public static final String MyPREFERENCES="Aman";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        b2=findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(signupactivity.this,loginactivity.class);
                startActivity(i1);
            }
        });
    }
}

