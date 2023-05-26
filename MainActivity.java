package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private RadioGroup radioGroup;
        private RadioButton genderbutton;
        private Button showButton;
        private TextView resultTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup= findViewById(R.id.radioGroupId);
        showButton= findViewById(R.id.buttonId);
        resultTextview= findViewById(R.id.resultTextviewId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int selectedId= radioGroup.getCheckedRadioButtonId();
             genderbutton=findViewById(selectedId);
             String value= genderbutton.getText().toString();
             resultTextview.setText("You have selected : "+ value);
            }
        });

    }
}