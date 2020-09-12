package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView mTheMessage;
        ImageView mThePicture;

        mTheMessage = findViewById(R.id.mainText);
        mThePicture = findViewById(R.id.mainPicture);

        mTheMessage.setText(TextActivity.message);
        mThePicture.setImageDrawable(PictureActivity.picture);

        if (mThePicture.getDrawable() == null) {
            Drawable tempPic;
            tempPic = getResources().getDrawable(R.drawable.heart);
            mThePicture.setImageDrawable(tempPic);

        }
    }

    public void navHome(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}