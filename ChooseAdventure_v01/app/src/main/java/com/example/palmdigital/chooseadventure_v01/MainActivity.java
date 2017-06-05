package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button_left;
    Button button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewStory = (TextView) findViewById(R.id.textView_story);
        TextView textViewQuestion = (TextView) findViewById(R.id.textView_question);

        textViewStory.setText("One morning the Tortoise woke up in a dream.");
        textViewQuestion.setText("Will you wake up or explore the dream?");

         button_left = (Button) findViewById(R.id.button_left);
         button_right = (Button) findViewById(R.id.button_right);

        button_left.setText("Wake up");
        button_right.setText("Explore");

        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);

        }

        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }

    }
}
