package com.example.alc4intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnwebview = findViewById(R.id.btnwebview);
        Button btnmyprofile = findViewById(R.id.btnmyprofile);

        btnmyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProfile();
            }
        });

        btnwebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutAlc();
            }
        });
    }

    public void MyProfile(){
        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }

    public void AboutAlc() {
        Intent intent = new Intent(this,AboutAlc.class);
        startActivity(intent);
    }
}
