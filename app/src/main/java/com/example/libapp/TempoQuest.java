package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TempoQuest extends AppCompatActivity {

    Button btnIniciar2;
    Button btnvoltVoc7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_quest);

        btnIniciar2 = findViewById(R.id.btnIniciar2);
        btnvoltVoc7 = findViewById(R.id.btnvoltVoc7);

        btnvoltVoc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQuest.this, TemaQuestao.class);
                startActivity(a);
            }
        });
       btnIniciar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQuest.this, TempoQ1.class);
                startActivity(a);
            }
        });
    }
}