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

    public void picAwesome(View view) {
        picture = getResources().getDrawable(R.drawable.awesome);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picIAmBall(View view) {
        picture = getResources().getDrawable(R.drawable.im_a_ball);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picSorry(View view) {
        picture = getResources().getDrawable(R.drawable.sorry);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picSprout(View view) {
        picture = getResources().getDrawable(R.drawable.sprout);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picStop(View view) {
        picture = getResources().getDrawable(R.drawable.stop);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picTroll(View view) {
        picture = getResources().getDrawable(R.drawable.troll);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picYes(View view) {
        picture = getResources().getDrawable(R.drawable.yes);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void picTongue(View view) {
        picture = getResources().getDrawable(R.drawable.tongue);
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}