package org.palmdigital.intents_putextra1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity
{
    String newerString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newerString = null;
            }
            else
            {
                newerString = extras.getString("story_later_on");
            }
        }
        else
        {
            newerString = (String) savedInstanceState.getSerializable("story_later_on");
        }


       tv_stories.setText(newerString);
    }
}
