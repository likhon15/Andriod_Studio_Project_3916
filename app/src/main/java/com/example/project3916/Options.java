package com.example.project3916;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Options extends AppCompatActivity {
    private Button buttoncalc,buttonquiz,loginbackbtn, converter, bmiBtnss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // To hide the titleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_options);
        bmiBtnss = (Button) findViewById(R.id.service0);
        buttoncalc = (Button) findViewById(R.id.service1);
        buttonquiz = (Button) findViewById(R.id.service2);
        loginbackbtn = (Button) findViewById(R.id.loginback);
        converter = (Button) findViewById(R.id.service3);
        buttoncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this, Calculator.class);
                startActivity(intent);
            }
        });
        buttonquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,Quiz1.class);
                startActivity(intent);
            }
        });
        loginbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,MainActivity.class);
                startActivity(intent);
            }
        });

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,ConverterShow.class);
                startActivity(intent);
            }
        });
        bmiBtnss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,BMIcalc.class);
                startActivity(intent);
            }
        });

    }
}