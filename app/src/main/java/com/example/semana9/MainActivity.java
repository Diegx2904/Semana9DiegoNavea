package com.example.semana9;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mivideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mivideo = findViewById(R.id.videoView);

        String video="android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri =Uri.parse(video);
        mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);
    }
}