package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class TemaVoc3 extends AppCompatActivity {

    Button btnProx8;
    Button btnvolt17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema_voc3);

        btnProx8 = findViewById(R.id.btnProx8);
        btnvolt17 = findViewById(R.id.btnvolt17);

        btnvolt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc3.this, TempoVoc2.class);
                startActivity(a);
            }
        });
        btnProx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TemaVoc3.this, TemaVoc.class);
                startActivity(a);
            }
        });
        VideoView videoAdvVoc = findViewById(R.id.videoAdvVoc);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoadvvoc;
        Uri uri = Uri.parse(videoPath);
        videoAdvVoc.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAdvVoc.setMediaController(mediaController);
        mediaController.setAnchorView(videoAdvVoc);
    }
}