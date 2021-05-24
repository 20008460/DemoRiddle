package sg.edu.rp.c346.id20008460.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Intent intentReceive = getIntent();
        String questionSelected =  intentReceive.getStringExtra("Question2"); // case sensitive

        tvAns = findViewById(R.id.textView2);
        tvAns.setText(questionSelected + " answer is : Gone");
    }
}