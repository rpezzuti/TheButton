package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SoundActivity extends AppCompatActivity {

    public static MediaPlayer mp;
    MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
    }

    public void soundMeep(View view) {
        mp2 = MediaPlayer.create(this, R.raw.meepmerp);
        mp2.start();
    }

    public void btnMeep(View view) {
        MainActivity.mediaInit = 1;
        mp = MediaPlayer.create(this, R.raw.meepmerp);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void soundChimes(View view) {
        mp2 = MediaPlayer.create(this, R.raw.chimes);
        mp2.start();
    }

    public void btnChimes(View view) {
        MainActivity.mediaInit = 1;
        mp = MediaPlayer.create(this, R.raw.chimes);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void soundFart(View view) {
        mp2 = MediaPlayer.create(this, R.raw.fart);
        mp2.start();
    }

    public void btnFart(View view) {
        MainActivity.mediaInit = 1;
        mp = MediaPlayer.create(this, R.raw.fart);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void soundTeehee(View view) {
        mp2 = MediaPlayer.create(this, R.raw.teehee);
        mp2.start();
    }

    public void btnTeehee(View view) {
        MainActivity.mediaInit = 1;
        mp = MediaPlayer.create(this, R.raw.teehee);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}