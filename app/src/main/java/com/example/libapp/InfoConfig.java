package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoConfig extends AppCompatActivity {

    Button btnVoltConfig1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_config);

        btnVoltConfig1 = findViewById(R.id.btnVoltConfig1);

        btnVoltConfig1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(InfoConfig.this, Config.class);
                startActivity(a);
            }
        });
    }
}