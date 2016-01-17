package com.example.vimpil1.p0081_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView)findViewById(R.id.myText);
        myTextView.setText("New text in TextView");
        Button myButton = (Button)findViewById(R.id.myBtn);
        myButton.setText("My button");
        myButton.setEnabled(false);
        CheckBox myCheckBox = (CheckBox) findViewById(R.id.myChb);
        myCheckBox.setChecked(true);
    }
}
