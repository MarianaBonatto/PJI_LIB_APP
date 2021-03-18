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

public class TempoQ1 extends AppCompatActivity {

    /*List<QuestoesPI> questoesTList = new ArrayList<QuestoesPI>(){
        {
            add(new QuestoesPI(R.id.rbutton23, "A tarde, eu viajarei de aviao", "Depois eu viajarei de aviao", "Na madrugada ela viajara de aviao", "No futuro, nós vamos viajar de aviao", "No passado, eles já viajaram de aviao"));
            add(new QuestoesPI(R.id.rbutton25, "Semana passada, eu comi laranja", "No passado, eu comia laranja", "Mês passado, eu comi laranja", "Ele já comeu maça", "Ano passado, ela comeu maça"));
            add(new QuestoesPI(R.id.rbutton22, "Eles fugiram ontem", "Eles fugiram anteontem", "Ele fugiu agora", "Eu fugi agora", "Ela fugiu semana passada"));
            add(new QuestoesPI(R.id.rbutton23, "Eu viajei em fevereiro", "Mulher viajou em janeiro", "Homem viajou em setembro", "Eu viajei em fevereiro", "Nós viajamos em setembro"));
            add(new QuestoesPI(R.id.rbutton24, "Segunda", "Terça", "Sexta", "Sábado", "Domingo"));
        }*/
    };
   /* TextView txtE2;
    RadioGroup radio2;
    RadioButton rbutton21, rbutton22, rbutton23, rbutton24, rbutton25;
    Button btnProx569;
    Button btnVoltInicio;
    VideoView videote;
    int respostaCerta2;
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_q1);

        txtE2 = findViewById(R.id.txtE2);
        radio2 = findViewById(R.id.radio2);
        rbutton21 = findViewById(R.id.rbutton21);
        rbutton22 = findViewById(R.id.rbutton22);
        rbutton23 = findViewById(R.id.rbutton23);
        rbutton24 = findViewById(R.id.rbutton24);
        rbutton25 = findViewById(R.id.rbutton25);
        btnProx569 = findViewById(R.id.btnProx569);
        btnVoltInicio = findViewById(R.id.btnVoltInicio);
        videote = findViewById(R.id.videote);
        respostaCerta2 = R.id.rbutton24;
        carregarQues();
        videosOrdem();

        MediaController mediaController = new MediaController(this);
        videote.setMediaController(mediaController);
        mediaController.setAnchorView(videote);

      /*  btnProx569.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup rg = findViewById(R.id.radio2);
                RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
                Intent intent = new Intent(TempoQ1.this, TempoRes.class);
                if (rg.getCheckedRadioButtonId() == respostaCerta2) {
                    intent.putExtra("acertou", true);
                    pontos++;
                } else
                    intent.putExtra("acertou", false);
                intent.putExtra("pontos", pontos);
                startActivity(intent);
                rb.setChecked(false);
            }});*/
    /*    btnVoltInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoQ1.this, TemaQuestao.class);
                startActivity(a);
            }
        });
    }
   /* protected  void onRestart(){
        super.onRestart();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.quest1tem;
        Uri uri = Uri.parse(videoPath);
        videote.setVideoURI(uri);
        carregarQues();
        videosOrdem();
    }
    private void carregarQues(){
        if (questoesTList.size()>0){
            QuestoesPI pi = questoesTList.remove(0);
            List<String> resposta = pi.getRespostas();
            rbutton21.setText(resposta.get(0));
            rbutton22.setText(resposta.get(1));
            rbutton23.setText(resposta.get(2));
            rbutton24.setText(resposta.get(3));
            rbutton25.setText(resposta.get(4));
            respostaCerta2 = pi.getRespostaCerta();
        }
        else {
            Intent intent = new Intent(TempoQ1.this, TempoFinal.class);
            intent.putExtra("pontos", pontos);
            startActivity(intent);
            finish();
        }

    }
    private void videosOrdem(){
        if (questoesTList.size() == 0){
            videote.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest1pron);
        } else if (questoesTList.size() == 1){
            videote.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest2pron);
        } else if (questoesTList.size() == 2){
            videote.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest3pron);
        } else if (questoesTList.size() == 3){
            videote.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest4pron);
        } else if (questoesTList.size() == 4)
            videote.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest5pron);
    }*/
