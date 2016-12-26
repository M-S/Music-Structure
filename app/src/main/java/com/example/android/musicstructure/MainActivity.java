package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find the view that shows Now Playing Activity
        Button nowPlaying = (Button) findViewById(R.id.now_playing_button);
        assert nowPlaying != null;
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        //Find the view that shows Recent Activity
        Button recentActivity = (Button) findViewById(R.id.recent_activity_button);
        assert recentActivity != null;
        recentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentActivityIntent = new Intent(MainActivity.this, RecentActivityActivity.class);
                startActivity(recentActivityIntent);
            }
        });
        //Find the view that shows Music Library
        Button musicLibrary = (Button) findViewById(R.id.music_library_button);
        assert musicLibrary != null;
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);
                startActivity(musicLibraryIntent);
            }
        });
    }
}
