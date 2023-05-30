package com.example.project3916;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BMIcalc extends AppCompatActivity {
    TextView outputView, weightText, heightText;
    Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // To hide the titleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_bmicalc);
        weightText=findViewById(R.id.firstVal);
        heightText=findViewById(R.id.secondVal);
        outputView=findViewById(R.id.showRES);
        myBtn=findViewById(R.id.bmiBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final DecimalFormat df = new DecimalFormat("0.00");
                Double weight, height, bmi;
                weight = Double.parseDouble(weightText.getText().toString());
                height=  Double.parseDouble(heightText.getText().toString());
                bmi =  weight / (height*height);
                outputView.setText("BMI is " + df.format(bmi));
            }
        });
    }
}