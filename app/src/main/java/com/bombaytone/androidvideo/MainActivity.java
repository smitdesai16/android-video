package com.bombaytone.androidvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vvMain = findViewById(R.id.vvMain);
        vvMain.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.sample);
        vvMain.start();
    }
}