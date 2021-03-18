package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TransporteFinal extends AppCompatActivity {

    Button btnTentNov;
    Button btnVoltTema5;
    TextView txtParabens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_final);

        btnTentNov = findViewById(R.id.btnTentNov);
        btnVoltTema5 = findViewById(R.id.btnVoltTema5);
        txtParabens = findViewById(R.id.txtParabens);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);
        txtParabens.setText("PARABÉNS, VOCÊ FEZ TODAS AS PERGUNTAS.                          TOTALIZOU " + pontos + " PONTOS!");

        btnVoltTema5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteFinal.this, TemaQuestao.class);
                startActivity(a);
            }
        });
        btnTentNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteFinal.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }
}