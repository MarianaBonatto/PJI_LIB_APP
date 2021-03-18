package com.example.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class AlfabetoVoc extends AppCompatActivity {
    Button btnvoltVoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto_voc);

        btnvoltVoc = findViewById(R.id.btnvoltVoc);

        btnvoltVoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(AlfabetoVoc.this, TemaVoc.class);
                startActivity(a);
            }
        });

        VideoView videoAlfa = findViewById(R.id.videoAlfa);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoalfavoc;
        Uri uri = Uri.parse(videoPath);
        videoAlfa.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoAlfa.setMediaController(mediaController);
        mediaController.setAnchorView(videoAlfa);
    }
}
