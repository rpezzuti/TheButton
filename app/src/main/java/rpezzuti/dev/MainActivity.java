package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeSound(View view) {
        mp = MediaPlayer.create(this, R.raw.meepmerp);
        mp.start();


        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Intent intent = new Intent (this, SecondActivity.class);
        startActivity(intent);
    }

}