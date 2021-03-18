package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TemaVoc extends AppCompatActivity {

    Button btnAlfabeto;
    Button btnNumero;
    Button btnPronome2;
    Button btnTempo2;
    Button btnTransporte2;
    Button btnVoltMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema_voc);
        btnAlfabeto = findViewById(R.id.btnAlfabeto);
        btnNumero = findViewById(R.id.btnNumero);
        btnPronome2 = findViewById(R.id.btnPronome2);
        btnTempo2 = findViewById(R.id.btnTempo2);
        btnTransporte2 = findViewById(R.id.btnTransporte2);
        btnVoltMenu2 = findViewById(R.id.btnVoltMenu2);

        btnVoltMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc.this, MainActivity.class);
                startActivity(a);
            }
        });

        btnAlfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent (TemaVoc.this, AlfabetoVoc.class);
                startActivity(a);
            }
        });

        btnNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc.this, NumeroVoc.class);
                startActivity(a);
            }
        });

        btnPronome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc.this, PronomeVoc.class);
                startActivity(a);
            }
        });
        btnTempo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc.this, TempoVoc.class);
                startActivity(a);
            }
        });
        btnTransporte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc.this, TransporteVoc.class);
                startActivity(a);
            }
        });

    }
}