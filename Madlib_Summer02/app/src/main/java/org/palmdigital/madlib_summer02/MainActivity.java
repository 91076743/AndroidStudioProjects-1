package org.palmdigital.madlib_summer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // TextView tv_story = (TextView) findViewById(R.id.textView_story);

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
//        tv_story.setText(newString);

    }
    public void next01 (View view)
    {
        // references
        EditText et_person = (EditText) findViewById(R.id.edit_text_person);
        EditText et_place = (EditText) findViewById(R.id.edit_text_place);
        EditText et_adjective = (EditText) findViewById(R.id.edit_text_adjective);
        EditText et_same_place = (EditText) findViewById(R.id.edit_text_same_place);
        EditText et_plural_noun = (EditText) findViewById(R.id.edit_text_plural_noun);

        String str_Person = et_person.getText().toString();
        String str_Place = et_place.getText().toString();
        String str_Adjective = et_adjective.getText().toString();
        String str_Same_Place = et_same_place.getText().toString();
        String str_Plural_Noun = et_plural_noun.getText().toString();

        String story = "Last summer, my mom and dad took me and ";
        story = story + str_Person + " on a trip to " + str_Place + ". The weather there is very " + str_Adjective;
        story += "! Northern " + str_Same_Place ;
        story += " has many " + str_Plural_Noun;

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("story_so_far", story);

        startActivity(i);
    }
}
