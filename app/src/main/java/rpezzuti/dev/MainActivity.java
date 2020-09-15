package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int x = 0;
    MediaPlayer temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeSound(View view) {

        if (x == 0) {
            temp = MediaPlayer.create(this, R.raw.meepmerp);
            temp.start();
        }

        else {
            SoundActivity.mp.start();
        }

        Intent intent = new Intent (this, SecondActivity.class);
        startActivity(intent);
    }

}