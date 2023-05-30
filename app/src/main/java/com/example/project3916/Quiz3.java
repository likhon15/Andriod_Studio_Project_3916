package com.example.project3916;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        score = findViewById(R.id.scores);
        Intent intent = getIntent();
        Integer finalScore = intent.getIntExtra(com.example.project3916.Quiz2.res2, 0);
        score.setText(" "+finalScore+ " out of 10");
    }
    public void tryAgain(View view) {
        Intent intent = new Intent(this, Quiz1.class);
        startActivity(intent);
    }
}