package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

    //To open the 'Now playing' activity when any of the songs in the list is clicked
        //Song Title 1 - Album 1
        TextView song1Album1 = (TextView) findViewById(R.id.song_title_1_album1);
        assert song1Album1 != null;
        song1Album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song1Album1Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song1Album1Intent);
            }
        });
        //Song Title 2 - Album 1
        TextView song2Album1 = (TextView) findViewById(R.id.song_title_2_album1);
        assert song2Album1 != null;
        song2Album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song2Album1Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song2Album1Intent);
            }
        });
        //Song Title 3 - Album 1
        TextView song3Album1 = (TextView) findViewById(R.id.song_title_3_album1);
        assert song3Album1 != null;
        song3Album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song3Album1Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song3Album1Intent);
            }
        });
        //Song Title 1 -Album 2
        TextView song1Album2 = (TextView) findViewById(R.id.song_title_1_album2);
        assert song1Album2 != null;
        song1Album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song1Album2Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song1Album2Intent);
            }
        });
        //Song Title 2 - Album 2
        TextView song2Album2 = (TextView) findViewById(R.id.song_title_2_album2);
        assert song2Album2 != null;
        song2Album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song2Album2Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song2Album2Intent);
            }
        });
        //Song Title 3 -Album 3
        TextView song3Album2 = (TextView) findViewById(R.id.song_title_3_album2);
        assert song3Album2 != null;
        song3Album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song3Album2Intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(song3Album2Intent);
            }
        });
    }
}
