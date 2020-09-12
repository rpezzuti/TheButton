package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class PictureActivity extends AppCompatActivity {

    public static Drawable picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
    }

    public void picHeart(View view) {
        picture = getResources().getDrawable(R.drawable.heart);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picFinger(View view) {
        picture = getResources().getDrawable(R.drawable.fuck_you);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}