package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Picture;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void textActivity(View view) {
        Intent intent = new Intent(this, TextActivity.class);
        startActivity(intent);
    }

    public void soundActivity(View view) {
        Intent intent = new Intent(this, SoundActivity.class);
        startActivity(intent);
    }

    public void pictureActivity(View view) {
        Intent intent = new Intent(this, PictureActivity.class);
        startActivity(intent);
    }

    public void startButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}