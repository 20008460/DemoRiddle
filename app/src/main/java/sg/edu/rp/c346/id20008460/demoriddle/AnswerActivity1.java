package sg.edu.rp.c346.id20008460.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("AnswerActivity1", "onCreate() called.");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Intent intentReceive = getIntent();
        String questionSelected =  intentReceive.getStringExtra("Question"); // case sensitive

        tvAns = findViewById(R.id.textView);

        if (questionSelected.equalsIgnoreCase("q1")) {
            tvAns.setText(questionSelected + " answer is : Queue");
        } else if (questionSelected.equalsIgnoreCase("q2")) {
            tvAns.setText(questionSelected + " answer is gone");
        }

    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}