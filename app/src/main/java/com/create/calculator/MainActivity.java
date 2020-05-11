package com.create.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int operation;
    int fnumber;
    int snumber;
    boolean operated = false;
    TextView textView = findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     /*  RelativeLayout relativeLayout = findViewById(R.id.relative);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );*/

        //setContentView(relativeLayout,layoutParams);

        setContentView(R.layout.activity_main);


        Button one = findViewById(R.id.button);
        one.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("1");
                        else
                            textView.setText(textView.getText() + "1");
                        operated = false;
                    }
                }
        );
        Button two = findViewById(R.id.button2);
        two.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("2");
                        else
                            textView.setText(textView.getText() + "2");
                        operated = false;
                    }
                }
        );
        Button three = findViewById(R.id.button3);
        three.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("3");
                        else
                            textView.setText(textView.getText() + "3");
                        operated = false;
                    }
                }
        );
        Button four = findViewById(R.id.button4);
        four.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("4");
                        else
                            textView.setText(textView.getText() + "4");
                        operated = false;
                    }
                }
        );
        Button five = findViewById(R.id.button5);
        five.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("5");
                        else
                            textView.setText(textView.getText() + "5");
                        operated = false;
                    }
                }
        );
        Button six = findViewById(R.id.button6);
        six.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("6");
                        else
                            textView.setText(textView.getText() + "6");
                        operated = false;
                    }
                }
        );
        Button seven = findViewById(R.id.button7);
        seven.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("7");
                        else
                            textView.setText(textView.getText() + "7");
                        operated = false;
                    }
                }
        );
        Button eight = findViewById(R.id.button8);
        eight.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("8");
                        else
                            textView.setText(textView.getText() + "8");
                        operated = false;
                    }
                }
        );
        Button nine = findViewById(R.id.button9);
        nine.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("9");
                        else
                            textView.setText(textView.getText() + "9");
                        operated = false;
                    }
                }
        );
        Button zero = findViewById(R.id.button11);
        zero.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (operated)
                            textView.setText("0");
                        else
                            textView.setText(textView.getText() + "0");
                        operated = false;
                    }
                }
        );

        Button division = findViewById(R.id.division);
        division.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        operator(1);
                    }
                }
        );
        Button multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        operator(2);
                    }
                }
        );
        Button addition = findViewById(R.id.Addition);
        addition.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        operator(3);
                    }
                }
        );
        Button subtraction = findViewById(R.id.Subtraction);
        subtraction.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        operator(4);
                    }
                }
        );
        Button equals = findViewById(R.id.Equals);
        equals.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String number = (String) textView.getText();
                        snumber = Integer.parseInt(number);
                        if (operation == 1) textView.setText(fnumber / snumber);
                        else if (operation == 2) textView.setText(fnumber * snumber);
                        else if (operation == 3) textView.setText(fnumber + snumber);
                        else if (operation == 4) textView.setText(fnumber - snumber);

                    }
                }
        );
    }

    public void operator(int i) {
        String number = (String) textView.getText();
        fnumber = Integer.parseInt(number);
        if (i == 1) textView.setText("/");
        else if (i == 2) textView.setText("*");
        else if (i == 3) textView.setText("+");
        else if (i == 4) textView.setText("-");
        operated = true;
        operation = i;
    }

}
