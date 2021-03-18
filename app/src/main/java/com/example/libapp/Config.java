package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Config extends AppCompatActivity {

    Button btnInfo;
    Button btnContato;
    Button btnVoltMenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        btnInfo = findViewById(R.id.btnInfo);
        btnContato = findViewById(R.id.btnContato);
        btnVoltMenu3 = findViewById(R.id.btnVoltMenu3);

        btnVoltMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Config.this, MainActivity.class);
                startActivity(a);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Config.this, InfoConfig.class);
                startActivity(a);
            }
        });
        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Config.this, ContatoConfig.class);
                startActivity(a);
            }
        });

    }
}