package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.musicstructure.SongsActivity.*;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Displays a toast message explaining its function when each of the media player buttons are clicked
        //for back button
        ImageView backButton = (ImageView) findViewById(R.id.back_button);
        assert backButton != null;
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Plays the previous song in the playlist", Toast.LENGTH_SHORT).show();
            }
        });
        //for pause button
        ImageView pauseButton = (ImageView) findViewById(R.id.pause_song_button);
        assert pauseButton != null;
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Pauses the current playing song", Toast.LENGTH_SHORT).show();
            }
        });
        //for play button
        ImageView playButton = (ImageView) findViewById(R.id.play_song_button);
        assert playButton != null;
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Plays the current song in the playlist", Toast.LENGTH_SHORT).show();
            }
        });
        //for next button
        ImageView nextButton = (ImageView) findViewById(R.id.next_song_button);
        assert nextButton != null;
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "Plays the next song in the playlist", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
