package org.palmdigital.intents_putextra1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01 (View view)
{
    // references
    EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adjective1);

    String str_adj1 = et_adj1.getText().toString();

    String story = "Pizza was invented by a " + str_adj1 + " Chef.";

    Intent i = new Intent(this, Main2Activity.class);
    i.putExtra("story_so_far", story);

    startActivity(i);
}

}
