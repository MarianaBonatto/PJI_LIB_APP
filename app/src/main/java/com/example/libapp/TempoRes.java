package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TempoRes extends AppCompatActivity {

    ImageView image2;
    TextView txtAcertou2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_res);

        image2 = findViewById(R.id.mariiupi2);
        txtAcertou2 = findViewById(R.id.txtAcertou2);

        Intent intent2 = getIntent();
        int pontos = intent2.getIntExtra("pontos", 0);
        boolean acertou2 = intent2.getBooleanExtra("acertou2", false);
        if (acertou2){
            image2.setImageResource(R.drawable.marinaiupi);
            txtAcertou2.setText("PARABÉNS, VOCÊ ACERTOU!   PONTOS : " + pontos );
        } else{
            image2.setImageResource(R.drawable.marinanao);
            txtAcertou2.setText("ESSA NÃO, VOCÊ ERROU!                                        PONTOS : " + pontos );
        }
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e2){
                    e2.printStackTrace();
                }
                finish();
            }
        });
        thread2.start();
    }

}