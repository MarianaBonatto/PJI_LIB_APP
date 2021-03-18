package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class TempoVoc2 extends AppCompatActivity {

    Button btnProx7;
    Button btnVoltTema4;
    Button btnvolt16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo_voc2);

        btnProx7 = findViewById(R.id.btnProx7);
        btnVoltTema4 = findViewById(R.id.btnVoltTema4);
        btnvolt16 = findViewById(R.id.btnvolt16);

        btnvolt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoVoc2.this, TempoVoc.class);
            startActivity(a);
            }
        });

        btnVoltTema4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoVoc2.this, TemaVoc.class);
                startActivity(a);
            }
        });
        btnProx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TempoVoc2.this, TemaVoc3.class);
                startActivity(a);
            }
        });

        VideoView videoMesVoc = findViewById(R.id.videoMesVoc);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videomesvoc;
        Uri uri = Uri.parse(videoPath);
        videoMesVoc.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoMesVoc.setMediaController(mediaController);
        mediaController.setAnchorView(videoMesVoc);
    }
}