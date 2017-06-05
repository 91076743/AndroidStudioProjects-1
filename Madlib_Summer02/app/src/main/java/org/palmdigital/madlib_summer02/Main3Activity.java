package org.palmdigital.madlib_summer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
String newString2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString2 = null;
            }
            else
            {
                newString2 = extras.getString("story_so_far");
            }
        }
        else
        {
            newString2 = (String) savedInstanceState.getSerializable("story_so_far");
        }




    }
    public void next03 (View view)
    {
        // references
        EditText et_plural_noun4 = (EditText) findViewById(R.id.edit_text_plural_noun4);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);
        EditText et_action_verb2 = (EditText) findViewById(R.id.edit_text_action_verb2);
        EditText et_action_verb3 = (EditText) findViewById(R.id.edit_text_action_verb3);
        EditText et_ad = (EditText) findViewById(R.id.edit_text_ad);

        String str_Plural_Noun4 = et_plural_noun4.getText().toString();
        String str_Noun = et_noun.getText().toString();
        String str_Action_Verb2 = et_action_verb2.getText().toString();
        String str_Action_Verb3 = et_action_verb3.getText().toString();
        String str_Ad = et_ad.getText().toString();

        String story = ". The people that live there love to eat " + str_Plural_Noun4 + " and are very proud of their big ";
        story += str_Noun + ". They also like to " + str_Action_Verb2 + " in the sun and swim in the ";
        story += str_Action_Verb3 + "! It was a really " + str_Ad + " trip!";


        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("story_so_far", story);

        startActivity(i);
    }
}
