package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronomeQuest extends AppCompatActivity {

    Button btnIniciar;
    Button btnvoltVoc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_quest);

        btnIniciar = findViewById(R.id.btnIniciar);
        btnvoltVoc6 = findViewById(R.id.btnvoltVoc6);

        btnvoltVoc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQuest.this, TemaQuestao.class);
                startActivity(a);
            }
        });
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQuest.this, PronomeQ1.class);
                startActivity(a);
            }
        });
    }
}