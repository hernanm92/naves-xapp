package com.xapp.naves.xapp;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

//TODO: usar YouTubePlayerFragment en ves de ViewVideoActivity para poder agregarle un navigation bar
public class ViewVideoActivity extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener{

    private static final String TAG = ViewVideoActivity.class.getSimpleName();
    public static final String API_KEY = "AIzaSyDzw0McyGses_csUu74l0R_LZLiPq55-sc";
    public static String VIDEO_ID = "OW-J2pQrlsw"; //final significaba que no se le puede cambiar el valor

    @Override
    protected void onCreate(Bundle savedInstanceState) { //el bundle es un objeto en el que podes guardar estados desde el activity anterior

        //Log.d(TAG, getIntent().getStringExtra("VideoId"));
        if(getIntent().getStringExtra("VideoId") != null){
            VIDEO_ID = getIntent().getStringExtra("VideoId");
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_video);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeplayerview);
        youTubePlayerView.initialize(API_KEY, this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_video, menu);
        return true;
    }

    @Override
    public void onInitializationFailure(Provider provider,
                                        YouTubeInitializationResult result) {
        Toast.makeText(getApplicationContext(),
                "onInitializationFailure()",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }

    public void rankActivity(View view) {
        Intent intent = new Intent(ViewVideoActivity.this, RankActivity.class);
        startActivity(intent);
    }

}