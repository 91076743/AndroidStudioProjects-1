package org.palmdigital.madlib_summer02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
String newString1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString1 = null;
            }
            else
            {
                newString1 = extras.getString("story_so_far");
            }
        }
        else
        {
            newString1 = (String) savedInstanceState.getSerializable("story_so_far");
        }

    }
    public void next02 (View view)
    {
        // references
        EditText et_adj = (EditText) findViewById(R.id.edit_text_adj);
        EditText et_plural_noun2 = (EditText) findViewById(R.id.edit_text_plural_noun2);
        EditText et_place2 = (EditText) findViewById(R.id.edit_text_place2);
        EditText et_action_verb = (EditText) findViewById(R.id.edit_text_action_verb);
        EditText et_plural_noun3 = (EditText) findViewById(R.id.edit_text_plural_noun3);

        String str_Adj = et_adj.getText().toString();
        String str_Plural_Noun2 = et_plural_noun2.getText().toString();
        String str_Place2 = et_place2.getText().toString();
        String str_Action_Verb = et_action_verb.getText().toString();
        String str_Plural_Noun3 = et_plural_noun3.getText().toString();

        String story = ", and they make" + str_Adj + str_Plural_Noun2 + " there. Many people also go to ";
        story += str_Place2 + " to " + str_Action_Verb + " or see the " + str_Plural_Noun3;

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("story_so_far", story);

        startActivity(i);
    }
}
