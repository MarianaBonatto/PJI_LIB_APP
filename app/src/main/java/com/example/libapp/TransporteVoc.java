package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class TransporteVoc extends AppCompatActivity {

    Button btnvoltVoc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_voc);

        btnvoltVoc5 = findViewById(R.id.btnvoltVoc5);

        btnvoltVoc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TransporteVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });

        VideoView videoTransVoc = findViewById(R.id.videoTransVoc);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videotransvoc;
        Uri uri = Uri.parse(videoPath);
        videoTransVoc.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoTransVoc.setMediaController(mediaController);
        mediaController.setAnchorView(videoTransVoc);
    }
}