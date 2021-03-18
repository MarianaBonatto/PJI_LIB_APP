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

public class PronomeQ1 extends AppCompatActivity {

    List<QuestoesPI> questoesPIList = new ArrayList<QuestoesPI>(){
        {
            add(new QuestoesPI(R.id.rbutton15, "Ele vai me encontrar!", "Como você me encontra?", "Como eles me encontraram?", "Como você vai me encontrar?", "Como ele me encontrou?"));
            add(new QuestoesPI(R.id.rbutton11, "Por que ela viajou?", "Por que você viajou?", "Por que nós viajamos?", "Por que todos viajamos?", "Onde nós viajamos?"));
            add(new QuestoesPI(R.id.rbutton13, "Onde você mora?", "Onde nós moramos?", "Onde vocês moram ?", "Onde nós vamos morar?", "Onde sua mãe mora?"));
            add(new QuestoesPI(R.id.rbutton12, "Quantos anos?", "Quantos anos ela tem?", "Quantos anos você tem?", "Quantos anos velho é você?", "Eu tenho 18 anos!"));
            add(new QuestoesPI(R.id.rbutton13, "Qual nome?", "Seu nome é?", "Qual seu nome?", "Qual é o nome dele?", "Nome dela qual?"));
        }
    };
    TextView txtE1;
    RadioGroup radio1;
    RadioButton rbutton11, rbutton12, rbutton13, rbutton14, rbutton15;
    Button btnProx12, btnVoltInicio1;
    VideoView videopi;
    int respostaCerta = R.id.rbutton13;
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronome_q1);

        txtE1 = findViewById(R.id.txtE1);
        radio1 = findViewById(R.id.radio1);
        rbutton11 = findViewById(R.id.rbutton11);
        rbutton12 = findViewById(R.id.rbutton12);
        rbutton13 = findViewById(R.id.rbutton13);
        rbutton14 = findViewById(R.id.rbutton14);
        rbutton15 = findViewById(R.id.rbutton15);
        btnProx12 = findViewById(R.id.btnProx12);
        btnVoltInicio1 = findViewById(R.id.btnVoltInicio1);
        videopi = findViewById(R.id.videopi);
        carregarQues();
        videosOrdem();

        MediaController mediaController = new MediaController(this);
        videopi.setMediaController(mediaController);
        mediaController.setAnchorView(videopi);

        btnProx12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = findViewById(R.id.radio1);
                RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                Intent intent = new Intent(PronomeQ1.this, PronomeRes.class);
                if (radioGroup.getCheckedRadioButtonId() == respostaCerta) {
                    intent.putExtra("acertou", true);
                    pontos++;
                } else
                    intent.putExtra("acertou", false);
                intent.putExtra("pontos", pontos);
                startActivity(intent);
                radioButton.setChecked(false);
            }});
        btnVoltInicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(PronomeQ1.this, PronomeQuest.class);
                startActivity(a);
            }
        });

}
    protected  void onRestart(){
        super.onRestart();
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.quest1pron;
        Uri uri = Uri.parse(videoPath);
        videopi.setVideoURI(uri);
        carregarQues();
        videosOrdem();
    }
        private void carregarQues(){
        if (questoesPIList.size()>0){
                QuestoesPI pi = questoesPIList.remove(0);
               List<String> resposta = pi.getRespostas();
               rbutton11.setText(resposta.get(0));
              rbutton12.setText(resposta.get(1));
             rbutton13.setText(resposta.get(2));
               rbutton14.setText(resposta.get(3));
                rbutton15.setText(resposta.get(4));
             respostaCerta = pi.getRespostaCerta();
        }
        else {
            Intent intent = new Intent(PronomeQ1.this, PronomeFinal.class);
            intent.putExtra("pontos", pontos);
            startActivity(intent);
            finish();
        }

}
    private void videosOrdem(){
        if (questoesPIList.size() == 0){
            videopi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest1pron);
        } else if (questoesPIList.size() == 1){
            videopi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest2pron);
        } else if (questoesPIList.size() == 2){
            videopi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest3pron);
        } else if (questoesPIList.size() == 3){
            videopi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest4pron);
        } else if (questoesPIList.size() == 4)
            videopi.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quest5pron);
    }
}