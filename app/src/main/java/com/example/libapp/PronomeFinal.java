package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PronomeFinal extends AppCompatActivity {

    Button btnTentNov3;
    Button btnVoltTema7;
    TextView txtParabens2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_final2);

        btnTentNov3 = findViewById(R.id.btnTentNov3);
        btnVoltTema7 = findViewById(R.id.btnVoltTema7);
        txtParabens2 = findViewById(R.id.txtParabens2);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);
        txtParabens2.setText("PARABÉNS, VOCÊ FEZ TODAS AS PERGUNTAS.                          TOTALIZOU " + pontos + " PONTOS!");

        btnVoltTema7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeFinal.this, TemaQuestao.class);
                startActivity(a);
            }
        });
        btnTentNov3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeFinal.this, TransporteQuest.class);
                startActivity(a);
            }
        });
    }

}