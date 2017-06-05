package org.palmdigital.hilowv02;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random answer = new Random();
        int value = answer.nextInt(1);
        Log.i("Info", value, );

    }
    public void guess(View view) {
        EditText et_input = (EditText) findViewById(R.id.edit_text_input);
        TextView tv_output = (TextView) findViewById(R.id.textView_output);
        String str_input = et_input.getText().toString();
        int input = Integer.parseInt(str_input);
        int value = 1;


        for (int i = 0; i < 8; i++)
        {
            if (input > 100 || input < 1) {
                tv_output.setText("Not a valid number. Try again.");
            }


//        else if (input == null)
//        {
//
//        }

            else if (value == input) {
                tv_output.setText("You Win!");
            } else if (input > value) {
                tv_output.setText("Too High.");
            } else if (input < value) {
                tv_output.setText("Too Low.");
            }
        }
    }

    public void again(View view)
    {

    }


}
