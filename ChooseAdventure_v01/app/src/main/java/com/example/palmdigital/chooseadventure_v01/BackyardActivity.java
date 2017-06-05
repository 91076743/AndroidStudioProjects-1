package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button_left;
    Button button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        TextView textViewStory = (TextView) findViewById(R.id.textView_story);
        TextView textViewQuestion = (TextView) findViewById(R.id.textView_question);

        textViewStory.setText("As you walk into the backyard a net scoops you up and a giant takes " +
                "you to a boiling pot of water.");
        textViewQuestion.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");

        button_left = (Button) findViewById(R.id.button_left);
        button_right = (Button) findViewById(R.id.button_right);

        button_left.setText("Scream");
        button_right.setText("Faint");

        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }

        else if (view.getId() == R.id.button_right)
        {
            Intent i = new Intent(this, FaintActivity.class);
            startActivity(i);
        }

    }
}
