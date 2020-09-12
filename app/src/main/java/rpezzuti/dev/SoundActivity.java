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
        MainActivity.x = 1;
        mp = MediaPlayer.create(this, R.raw.meepmerp);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void soundChimes(View view) {
        mp2 = MediaPlayer.create(this, R.raw.chimes);
        mp2.start();
    }

    public void btnChimes(View view) {
        MainActivity.x = 1;
        mp = MediaPlayer.create(this, R.raw.chimes);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}