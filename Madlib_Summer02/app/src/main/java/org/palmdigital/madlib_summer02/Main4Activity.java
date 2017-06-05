package org.palmdigital.madlib_summer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity
{
//String newString3;
    String newString;
//    String newString1;
//    String newString2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

//        TextView tv_story = (TextView) findViewById(R.id.textView_story);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
//                newString1 = null;
//                newString2 = null;
            }
            else
            {
                newString = extras.getString("story_so_far");
//                newString1 = extras.getString("story_so_far2");
//                newString2 = extras.getString("story_so_far3");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("story_so_far");
//            newString1 = (String) savedInstanceState.getSerializable("story_so_far2");
//            newString2 = (String) savedInstanceState.getSerializable("story_so_far3");
        }

//        tv_story.setText(newString);
//        tv_story.setText(newString1);
//        tv_story.setText(newString2);
    }
    public void finish (View view)
    {
        TextView tv_story = (TextView) findViewById(R.id.textView_story);

        tv_story.setText(newString);
//        tv_story.setText(newString1);
//        tv_story.setText(newString2);
       // tv_story.setText(newString3);

    }

}
