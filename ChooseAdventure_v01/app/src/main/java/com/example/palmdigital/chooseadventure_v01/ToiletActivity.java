package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener
{

    Button button_left;
    Button button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        TextView textViewStory = (TextView) findViewById(R.id.textView_story);
        TextView textViewQuestion = (TextView) findViewById(R.id.textView_question);

        textViewStory.setText("As you pour the ooze into the toilet it backs up, gurgles, and" +
                " explodes, covering you in radioactive waste.");
        textViewQuestion.setText("Do you want to train to be a NINJA? 'Yes' or 'HECK YES'?");

        button_left = (Button) findViewById(R.id.button_left);
        button_right = (Button) findViewById(R.id.button_right);

        button_left.setText("Yes");
        button_right.setText("HECK YES");

        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);

        }

        else if (view.getId() == R.id.button_right)
        {
             Intent i = new Intent(this, YesActivity.class);
             startActivity(i);
        }

    }
}
