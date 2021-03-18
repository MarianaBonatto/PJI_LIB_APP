package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class NumeroVoc extends AppCompatActivity {

    Button btnVoltVoc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_voc);

        btnVoltVoc2 = findViewById(R.id.btnvoltVoc2);

        btnVoltVoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(NumeroVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });
        VideoView videoNum = findViewById(R.id.videoNum);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videonumvoc;
        Uri uri = Uri.parse(videoPath);
        videoNum.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoNum.setMediaController(mediaController);
        mediaController.setAnchorView(videoNum);
    }
}