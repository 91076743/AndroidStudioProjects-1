package com.example.palmdigital.chooseyourownadveture_v02;

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

    TextView textViewStory;
    TextView textViewQuestion;

int operator;
    int operater1;


    @Override
    protected void onCreate(Bundle savedInstanceState )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          textViewStory = (TextView) findViewById(R.id.textView_story);
          textViewQuestion = (TextView) findViewById(R.id.textView_question);


        center();


    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left && operator == 0)
        {
            wakeUp();
            
        }

        else if (view.getId() == R.id.button_right && operater1 == 0)
        {
            explore();
            operator =+ 1;
        }
    }

    public void center()
    {
        if (operator == 0)
        {
            mainScreen();
        }


    }


    public void mainScreen()
    {
        button_right = (Button) findViewById(R.id.button_right);
        button_left = (Button) findViewById(R.id.button_left);

        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);

        textViewStory.setText("One morning the Tortoise woke up in a dream.");
        textViewQuestion.setText("Will you wake up or explore the dream?");
        button_left.setText("Wake up");
        button_right.setText("Explore");
    }

    public void wakeUp()
    {
        textViewStory.setText("You wake up and have a boring day. THE END");
        textViewQuestion.setText("");
       button_left.setText("");
        button_right.setText("");

        button_left.setBackgroundColor(0xffff8800);
        button_right.setBackgroundColor(0xffff8800);
    }

    public void explore()
    {
        textViewStory.setText("You approach a glowing bucket of green ooze. Afraid of getting in trouble you pick up the bucket.");
        textViewQuestion.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        button_left.setText("Backyard");
        button_right.setText("Toilet");

        button_left.setBackgroundColor(0xffffffff);
        button_right.setBackgroundColor(0xffffffff);
    }
}
