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

public class BlankFragment2 extends Fragment {
    View myView;
    TextView outputView, usdText;
    Button myBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_blank2, container, false);
        outputView=myView.findViewById(R.id.showRES);
        usdText = myView.findViewById(R.id.firstVal);
        myBtn=myView.findViewById(R.id.bmiBtn);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final DecimalFormat df = new DecimalFormat("0.00");
                Double USD, result;
                USD = Double.parseDouble(usdText.getText().toString());
                result =  (USD*114);
                outputView.setText("BDT is " + df.format(result));
            }
        });
        return myView;
    }
}