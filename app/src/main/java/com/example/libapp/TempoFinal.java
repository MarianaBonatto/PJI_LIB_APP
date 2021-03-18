package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TempoFinal extends AppCompatActivity {

    Button btnTentNov4;
    Button btnVoltTema8;
    TextView txtParabens3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_final);

        btnTentNov4 = findViewById(R.id.btnTentNov4);
        btnVoltTema8 = findViewById(R.id.btnVoltTema8);
        txtParabens3 = findViewById(R.id.txtParabens3);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);
        txtParabens3.setText("PARABÉNS, VOCÊ FEZ TODAS AS PERGUNTAS.                          TOTALIZOU " + pontos + " PONTOS!");

        btnVoltTema8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoFinal.this, TemaQuestao.class);
                startActivity(a);
            }
        });
        btnTentNov4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoFinal.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
    }
