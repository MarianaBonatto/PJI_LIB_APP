package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TransporteRes extends AppCompatActivity {

    ImageView image3;
    TextView txtacerto3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_res);

        image3 = findViewById(R.id.marihiupi);
        txtacerto3 = findViewById(R.id.acerto3);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);
        boolean acertou = intent.getBooleanExtra("acertou", false);
        if (acertou){
            image3.setImageResource(R.drawable.marianaiupi);
            txtacerto3.setText("PARABÉNS, VOCÊ ACERTOU!   PONTOS : " + pontos );
        } else{
            image3.setImageResource(R.drawable.mariananao);
            txtacerto3.setText("ESSA NÃO, VOCÊ ERROU!                                        PONTOS : " + pontos );
        }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finish();
            }
        });
        thread.start();
    }
}