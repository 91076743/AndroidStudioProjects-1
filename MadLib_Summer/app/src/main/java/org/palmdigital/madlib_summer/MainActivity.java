package org.palmdigital.madlib_summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory (View view)
    {
        // et and tv
        EditText et_color = (EditText) findViewById(R.id.edit_text_color01);
        EditText et_body_part = (EditText) findViewById(R.id.edit_text_body_part);
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun);
        EditText et_verb = (EditText) findViewById(R.id.edit_text_verb);
        EditText et_adjective = (EditText) findViewById(R.id.edit_text_adjective);
        EditText et_adj = (EditText) findViewById(R.id.edit_text_adj);
        EditText et_verbs = (EditText) findViewById(R.id.edit_text_verbs);
        EditText et_nouns = (EditText) findViewById(R.id.edit_text_nouns);
        EditText et_end = (EditText) findViewById(R.id.edit_text_end);
        EditText et_plural_noun = (EditText) findViewById(R.id.edit_text_plural_noun);
        EditText et_plural = (EditText) findViewById(R.id.edit_text_plural);
        EditText et_non = (EditText) findViewById(R.id.edit_text_non);
        EditText et_action = (EditText) findViewById(R.id.edit_text_action);
        EditText et_act = (EditText) findViewById(R.id.edit_text_act);
        EditText et_a = (EditText) findViewById(R.id.edit_text_a);


        TextView tv_story = (TextView) findViewById(R.id.textView_story);

//strings
        String str_Color = et_color.getText().toString();
        String str_Body = et_body_part.getText().toString();
        String str_Noun = et_noun.getText().toString();
        String str_Verb = et_verb.getText().toString();
        String str_Adjective = et_adjective.getText().toString();
        String str_Adj = et_adj.getText().toString();
        String str_Verbs = et_verbs.getText().toString();
        String str_Nouns = et_nouns.getText().toString();
        String str_End = et_end.getText().toString();
        String str_Plural_Noun = et_plural_noun.getText().toString();
        String str_Plural = et_plural.getText().toString();
        String str_Non = et_non.getText().toString();
        String str_Action = et_action.getText().toString();
        String str_Act = et_act.getText().toString();
        String str_A = et_a.getText().toString();

        String story = "Last summer, my mom and dad took me and ";
        story = story + str_Color + " on a trip to " + str_Body + ". The weather there is very " + str_Noun;
        story += "! Northern " + str_Verb ;
        story += " has many " + str_Adjective + ", and they make" + str_Adj + str_Verbs + " there. Many people also go to ";
        story += str_Nouns + " to " + str_End + " or see the " + str_Plural_Noun;
        story += ". The people that live there love to eat " + str_Plural + " and are very proud of their big ";
        story += str_Non + ". They also like to " + str_Action + " in the sun and swim in the ";
        story += str_Act + "! It was a really " + str_A + " trip!";


        tv_story.setText(story);
    }
}
