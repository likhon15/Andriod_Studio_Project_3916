package com.example.project3916;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioGroup;

public class Quiz1 extends AppCompatActivity {
    RadioGroup radioGroup;
    public static final String res1 = "com.example.quizappfirst.extra.1.result";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // To hide the titleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_quiz1);
        radioGroup = findViewById(R.id.radioOption);
    }
    public void nextPage(View view) {
        Intent intent = new Intent(this, Quiz2.class);
        intent.putExtra(res1, rightOrWrongChecker());
        startActivity(intent);
    }
    int rightOrWrongChecker(){
        int selectedID = radioGroup.getCheckedRadioButtonId();
        Button selectedButton = findViewById(selectedID);
        String selectedText = selectedButton.getText().toString();
        switch(selectedText){
            case "Hilsha":
                return 5;
            default:
                return 0;
        }
    }
    public void prePage(View view) {
        Intent intent = new Intent(Quiz1.this, Options.class);
        startActivity(intent);
    }
}