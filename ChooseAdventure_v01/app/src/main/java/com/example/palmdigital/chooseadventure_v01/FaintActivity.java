package com.example.palmdigital.chooseadventure_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);
        TextView textViewStory = (TextView) findViewById(R.id.textView_story);

        textViewStory.setText("You made a lovely stew. THE END");

    }
}
