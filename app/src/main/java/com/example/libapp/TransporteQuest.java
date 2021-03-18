package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteQuest extends AppCompatActivity {

    Button btnIniciar3;
    Button btnvoltVoc8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_quest);

        btnIniciar3 = findViewById(R.id.btnIniciar3);
        btnvoltVoc8 = findViewById(R.id.btnvoltVoc8);

        btnvoltVoc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQuest.this, TemaQuestao.class);
                startActivity(a);
            }
        });
        btnIniciar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQuest.this, TransporteQ1.class);
                startActivity(a);
            }
        });
    }
}