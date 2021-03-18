package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class TransporteQ1 extends AppCompatActivity {

    List<QuestoesPI> questoesTList = new ArrayList<QuestoesPI>(){
        {
            add(new QuestoesPI(R.id.rbutton32, "Eu nunca navegar.", "Ela sempre anda de barco", "Ele nunca andou de barco", "Nós vamos andar de barco", "Eu sempre ando de barco"));
            add(new QuestoesPI(R.id.rbutton33, "Meu irmão tem uma moto.", "Minha mãe tem um caminhão ", "Meu pai tem um caminhão ", "Meu pai dono do metrô", "Meu pai tinha um ônibus"));
            add(new QuestoesPI(R.id.rbutton35, "Ano passado eu viajei de avião ", "Mês passado eu viajei de avião", "Ano que vem eu viajar de avião ", "Ano que vem eu viajar de helicóptero ", "Ano passado eu viajei de helicóptero"));
            add(new QuestoesPI(R.id.rbutton34, "Onde está minha moto?", "Onde fica o ponto de ônibus?", "Quando vamos andar de avião?", "Onde está meu carro?", "Meu carro!"));
            add(new QuestoesPI(R.id.rbutton31, "Ontem eu ir de bicicleta trabalhar", "Ele ir de bicicleta para a escola", "Ontem ele ir de moto para a escola", "Ontem ele ir de moto para o trabalho", "Hoje nós fomos de bicicleta para o trabalho "));
        }
    };
    Button btnvolt11;
    Button btnProx11;
    VideoView videot;
    RadioGroup radio3;
    RadioButton rbutton31, rbutton32, rbutton33, rbutton34, rbutton35;
    TextView txtE3;
    int respostaCerta = R.id.rbutton31;
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_q1);

        btnvolt11 = findViewById(R.id.btnvolt11);
        btnProx11 = findViewById(R.id.btnProx11);
        videot = findViewById(R.id.videot);
        radio3 = findViewById(R.id.radio3);
        rbutton31 = findViewById(R.id.rbutton31);
        rbutton32 = findViewById(R.id.rbutton32);
        rbutton33 = findViewById(R.id.rbutton33);
        rbutton34 = findViewById(R.id.rbutton34);
        rbutton35 = findViewById(R.id.rbutton35);
        txtE3 = findViewById(R.id.txtE3);
        caregarQuestao();
        videosOrdem();


        MediaController mediaController = new MediaController(this);
        videot.setMediaController(mediaController);
        mediaController.setAnchorView(videot);

        btnProx11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = findViewById(R.id.radio3);
                RadioButton rb = findViewById(radioGroup.getCheckedRadioButtonId());
                Intent intent = new Intent(TransporteQ1.this, TransporteRes.class);
                if (radioGroup.getCheckedRadioButtonId() == respostaCerta){
                    intent.putExtra("acertou", true);
                    pontos++;
                }
                else
                    intent.putExtra("acertou", false);
                    intent.putExtra("pontos", pontos);
                    startActivity(intent);
                    rb.setChecked(false);
            }
        });
        btnvolt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteQ1.this, TransporteQuest.class);
                startActivity(a);
            }
        });


    }
    protected  void onRestart(){
        super.onRestart();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.questao1transporte;
        Uri uri = Uri.parse(videoPath);
        videot.setVideoURI(uri);
        caregarQuestao();
        videosOrdem();
    }
    private void caregarQuestao(){
        if (questoesTList.size()>0) {
            QuestoesPI t = questoesTList.remove(0);
            List<String> resposta = t.getRespostas();
            rbutton31.setText(resposta.get(0));
            rbutton32.setText(resposta.get(1));
            rbutton33.setText(resposta.get(2));
            rbutton34.setText(resposta.get(3));
            rbutton35.setText(resposta.get(4));
            respostaCerta = t.getRespostaCerta();
        }
        else {
            Intent intent = new Intent(TransporteQ1.this, TransporteFinal.class);
            intent.putExtra("pontos", pontos);
            startActivity(intent);
            finish();
        }
    }
    private void videosOrdem(){
        if (questoesTList.size() == 0){
            videot.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.questao1transporte);
        } else if (questoesTList.size() == 1){
            videot.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.questao2trasporte);
        } else if (questoesTList.size() == 2){
            videot.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.questao3transporte);
        } else if (questoesTList.size() == 3){
            videot.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.questao4transporte);
        } else if (questoesTList.size() == 4)
            videot.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.questao5transporte);
    }
}