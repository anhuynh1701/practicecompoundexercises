package com.spkt.practicecompoundexercises;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Signin extends AppCompatActivity {
    Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btnMain =(Button) findViewById(R.id.tosignup);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Signin.this,Signup.class);
                startActivity(intent);
            }
        });
        btnMain =(Button) findViewById(R.id.signUpButton);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Signin.this,Menu.class);
                startActivity(intent);
            }
        });
    }
}