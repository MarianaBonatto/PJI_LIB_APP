package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TemaQuestao extends AppCompatActivity {

    Button btnPronome;
    Button btnTempo;
    Button btnTransporte;
    Button btnVoltMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema_questao);

        btnPronome = findViewById(R.id.btnPronome);
        btnTempo = findViewById(R.id.btnTempo);
        btnTransporte = findViewById(R.id.btnTransporte);
        btnVoltMenu = findViewById(R.id.btnVoltMenu);

        btnVoltMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaQuestao.this, MainActivity.class);
                startActivity(a);
            }
        });
        btnPronome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaQuestao.this, PronomeQuest.class);
                startActivity(a);
            }
        });
        btnTempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaQuestao.this, TempoQuest.class);
                startActivity(a);
            }
        });
        btnTransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaQuestao.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
}