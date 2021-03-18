package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PronomeRes extends AppCompatActivity {

    TextView txtAcertou;
    ImageView mariiupi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_res);

        txtAcertou = findViewById(R.id.txtAcertou);
        mariiupi = findViewById(R.id.mariiupi);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);
        boolean acertou = intent.getBooleanExtra("acertou", false);
        if (acertou){
            mariiupi.setImageResource(R.drawable.marinaiupi);
            txtAcertou.setText("PARABÉNS, VOCÊ ACERTOU!   PONTOS : " + pontos );
        } else {
            mariiupi.setImageResource(R.drawable.marinanao);
            txtAcertou.setText("ESSA NÃO, VOCÊ ERROU!                                        PONTOS : " + pontos );
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