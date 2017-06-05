package org.palmdigital.intents_putextra1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // reference
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("story_so_far");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("story_so_far");
        }


        tv_story.setText(newString);
    }
    public void next02 (View view)
    {
        EditText et_nationality = (EditText) findViewById(R.id.edit_text_nationality);

        String str_nationality = et_nationality.getText().toString();

        String story = "Pizza was invented by a " + str_nationality + " Chef.";

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("story_later_on", story);

        startActivity(i);
    }
}
