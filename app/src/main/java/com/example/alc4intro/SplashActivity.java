package com.example.alc4intro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {
    private VideoView videoViewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        videoViewSplash = findViewById(R.id.videoViewSplash);
        videoViewSplash.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.andelasplash);
        videoViewSplash.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (isFinishing())
                    return;
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        });
        videoViewSplash.start();
    }
}
