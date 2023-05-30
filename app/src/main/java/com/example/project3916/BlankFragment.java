package com.example.project3916;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BlankFragment extends Fragment {
    View myView;
    EditText cmText;
    TextView outputView;
    Button myBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_blank, container, false);
        cmText=myView.findViewById(R.id.secondVal);
        outputView=myView.findViewById(R.id.showRES);
        myBtn=myView.findViewById(R.id.bmiBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final DecimalFormat df = new DecimalFormat("0.00");
                Double cm, result;
                cm = Double.parseDouble(cmText.getText().toString());
                result =  cm / 2.54;
                outputView.setText("Inch is " + df.format(result));
            }
        });
        return myView;
    }
}