package rpezzuti.dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {


    private TextView mCurrentText, mFetch;
    private EditText mNewText;
    public static String message = "Hello!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        mFetch = findViewById(R.id.mainText);
        mCurrentText = findViewById(R.id.currentText);
        mCurrentText.setText(message);
        mNewText = findViewById(R.id.newText);
    }


    public void changeText (View v) {
        message = mNewText.getText().toString();
        mCurrentText.setText(message);
    }

    public void goHome(View v) {
        Intent intent = new Intent (this, HomeActivity.class);
        startActivity(intent);
    }
}