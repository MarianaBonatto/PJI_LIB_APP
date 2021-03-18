package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContatoConfig extends AppCompatActivity {

    Button btnvoltConfig2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato_config);

        btnvoltConfig2 = findViewById(R.id.btnvoltConfig2);

        btnvoltConfig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ContatoConfig.this, Config.class);
                startActivity(a);
            }
        });
    }
}