package com.xapp.naves.xapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class VideoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openMain(View view) {
        Intent intent = new Intent(VideoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void watchBMXVideo(View view) { //se le puede pasar el id de los videos
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=K9XCKP9KN7A"));
        startActivity(intent);
    }

    public void watchLongboardVideo(View view) { //se le puede pasar el id de los videos
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=KcAc4opTvaE"));
        startActivity(intent);
    }

    public void goToApiVideo(View view) {
        Intent intent = new Intent(VideoActivity.this, ViewVideoActivity.class);
        startActivity(intent);
    }

}
