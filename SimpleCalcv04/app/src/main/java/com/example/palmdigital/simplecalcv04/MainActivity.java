package com.example.palmdigital.simplecalcv04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{


    float num1, num2;
    int sum;
    int operator;


    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageViewMultiplication;
    ImageView imageViewDivision;
    ImageView imageViewEqual;
    ImageView imageViewClear;
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);
        imageViewClear = (ImageView) findViewById(R.id.imageViewClear);
         imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
         imageViewMinus = (ImageView) findViewById(R.id.imageViewMinus);
         imageViewMultiplication = (ImageView) findViewById(R.id.imageViewMultiplication);
         imageViewDivision = (ImageView) findViewById(R.id.imageViewDivision);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageViewNum11 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageViewNum12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageViewNum13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageViewNum14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageViewNum15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageViewNum16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageViewNum17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageViewNum18 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageViewNum19 = (ImageView) findViewById(R.id.imageView19);
         imageViewEqual = (ImageView) findViewById(R.id.imageViewEqual);

        imageView.setOnClickListener(this);
        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);
        imageViewClear.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewMultiplication.setOnClickListener(this);
        imageViewDivision.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageViewNum11.setOnClickListener(this);
        imageViewNum12.setOnClickListener(this);
        imageViewNum13.setOnClickListener(this);
        imageViewNum14.setOnClickListener(this);
        imageViewNum15.setOnClickListener(this);
        imageViewNum16.setOnClickListener(this);
        imageViewNum17.setOnClickListener(this);
        imageViewNum18.setOnClickListener(this);
        imageViewNum19.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);

         textView_top = (TextView) findViewById(R.id.textView_top);
         textView_middle = (TextView) findViewById(R.id.textView_middle);
         textView_bottom = (TextView) findViewById(R.id.textView_bottom);
    }
    public void onClick (View view)
    {
        if (view.getId() == R.id.imageView)
        {
            textView_top.setText("0");
            num1 = 0;
        }

        else if (view.getId() == R.id.imageView1)
        {
            textView_top.setText("1");
            num1 = 1;
        }

        else if (view.getId() == R.id.imageView2)
        {
            textView_top.setText("2");
            num1 = 2;
        }

        else if (view.getId() == R.id.imageView3)
        {
            textView_top.setText("3");
            num1 = 3;
        }

        else if (view.getId() == R.id.imageView4)
        {
            textView_top.setText("4");
            num1 = 4;
        }

        else if (view.getId() == R.id.imageView5)
        {
            textView_top.setText("5");
            num1 = 5;
        }

        else if (view.getId() == R.id.imageView6)
        {
            textView_top.setText("6");
            num1 = 6;
        }

        else if (view.getId() == R.id.imageView7)
        {
            textView_top.setText("7");
            num1 = 7;
        }

        else if (view.getId() == R.id.imageView8)
        {
            textView_top.setText("8");
            num1 = 8;
        }

        else if (view.getId() == R.id.imageView9)
        {
            textView_top.setText("9");
            num1 = 9;
        }

        if (view.getId() == R.id.imageView10)
        {
            textView_middle.setText("0");
            num2 = 0;
        }

        else if (view.getId() == R.id.imageView11)
        {
            textView_middle.setText("1");
            num2 = 1;
        }

        else if (view.getId() == R.id.imageView12)
        {
            textView_middle.setText("2");
            num2 = 2;
        }

        else if (view.getId() == R.id.imageView13)
        {
            textView_middle.setText("3");
            num2 = 3;
        }

        else if (view.getId() == R.id.imageView14)
        {
            textView_middle.setText("4");
            num2 = 4;
        }

        else if (view.getId() == R.id.imageView15)
        {
            textView_middle.setText("5");
            num2 = 5;
        }

        else if (view.getId() == R.id.imageView16)
        {
            textView_middle.setText("6");
            num2 = 6;
        }

        else if (view.getId() == R.id.imageView17)
        {
            textView_middle.setText("7");
            num2 = 7;
        }

        else if (view.getId() == R.id.imageView18)
        {
            textView_middle.setText("8");
            num2 = 8;
        }

        else if (view.getId() == R.id.imageView19)
        {
            textView_middle.setText("9");
            num2 = 9;
        }

        else if (sum == 0)
        {

        }
        
        else if (view.getId() == R.id.imageViewClear)
        {
            textView_top.setText("");
            num1 = 0;
            textView_middle.setText("");
            num2 = 0;
            textView_bottom.setText("");
            operator = 0;
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewMultiplication.setBackgroundColor(0xffffffff);
            imageViewDivision.setBackgroundColor(0xffffffff);
        }

        else if (view.getId() == R.id.imageViewPlus)
        {
            operator = 0;
            imageViewPlus.setBackgroundColor(0xffff00ff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewMultiplication.setBackgroundColor(0xffffffff);
            imageViewDivision.setBackgroundColor(0xffffffff);
        }

        else if (view.getId() == R.id.imageViewMinus)
        {
            operator = 1;
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffff00ff);
            imageViewMultiplication.setBackgroundColor(0xffffffff);
            imageViewDivision.setBackgroundColor(0xffffffff);
        }

        else if (view.getId() == R.id.imageViewMultiplication)
        {
            operator = 2;
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewMultiplication.setBackgroundColor(0xffff00ff);
            imageViewDivision.setBackgroundColor(0xffffffff);
        }

        else if (view.getId() == R.id.imageViewDivision)
        {
            operator = 3;
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xffffffff);
            imageViewMultiplication.setBackgroundColor(0xffffffff);
            imageViewDivision.setBackgroundColor(0xffff00ff);
        }

        else if (view.getId() == R.id.imageViewEqual)
        {
            textView_bottom.setText("" + sum);
            if (operator == 0)
            {
                textView_bottom.setText("" + (num1 + num2));
            }

            else if (operator == 1)
            {
                textView_bottom.setText("" + (num1 - num2));
            }

            else if (operator == 2)
            {
                textView_bottom.setText("" + (num1 * num2));
            }

            else if (operator == 3)
            {
                textView_bottom.setText("" + (num1 / num2));
                divideZero();
            }
        }
    }

    public void divideZero()
    {
        if (num2 == 0)
        {
            textView_bottom.setText("ERROR");
        }
    }
}
