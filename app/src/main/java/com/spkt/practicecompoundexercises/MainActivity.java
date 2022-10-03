package com.spkt.practicecompoundexercises;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btnMain =(Button) findViewById(R.id.tosignup);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this,Signup.class);
                startActivity(intent);
            }
        });
    }
}