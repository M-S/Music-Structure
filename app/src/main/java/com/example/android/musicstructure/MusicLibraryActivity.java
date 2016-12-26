package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

    // To open the Play List Activity when the text view PlayLists is clicked
        TextView playLists = (TextView) findViewById(R.id.playlist_text_view);
        assert playLists != null;
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListIntent = new Intent(MusicLibraryActivity.this, PlayListsActivity.class);
                startActivity(playListIntent);
            }
        });
    // To open the Albums Activity when the text view Albums is clicked
        TextView albums = (TextView) findViewById(R.id.albums_text_view);
        assert albums != null;
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MusicLibraryActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
    // To open the Artists Activity when the text view Artists is clicked
        TextView artists = (TextView) findViewById(R.id.artists_text_view);
        assert artists != null;
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MusicLibraryActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
    // To open the Songs Activity when the text view Songs is clicked
        TextView songs = (TextView) findViewById(R.id.songs_text_view);
        assert songs != null;
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MusicLibraryActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
