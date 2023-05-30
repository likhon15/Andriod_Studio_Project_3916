package com.example.project3916;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioGroup;
import android.widget.Button;

public class Quiz2 extends AppCompatActivity {
    RadioGroup radioGroup;
    public static final String res2 = "com.example.quizappfirst.extra.2.result";
    Integer quizScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        radioGroup = findViewById(R.id.radioOptionQ2);
        Intent intent = getIntent();
        quizScore = intent.getIntExtra(Quiz1.res1, 0);
    }
    public void prePage(View view) {
        Intent intent = new Intent(this, Quiz1.class);
        startActivity(intent);
    }
    public void nextPage(View view) {
        Intent intent = new Intent(this, Quiz3.class);
        intent.putExtra(res2, rightOrWrongChecker()+quizScore);
        startActivity(intent);
    }
    int rightOrWrongChecker(){
        int selectedID = radioGroup.getCheckedRadioButtonId();
        Button selectedButton = findViewById(selectedID);
        String selectedText = selectedButton.getText().toString();
        switch(selectedText){
            case "Jackfruit":
                return 5;
            default:
                return 0;
        }
    }
}





