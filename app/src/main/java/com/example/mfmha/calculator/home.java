package com.example.mfmha.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//<!--created by K. A. Mahamudul Hasan-->
//        <!--id: 161-15-7303-->

public class home extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,into,div,dot,equal,c;
    TextView out;
    String num1,num2,ans,action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        num1 = "";  num2 = "";  ans = "";   action = "";
        one =  findViewById(R.id.one);
        two =  findViewById(R.id.two);
        three =  findViewById(R.id.three);
        four =  findViewById(R.id.four);
        five =  findViewById(R.id.five);
        six =  findViewById(R.id.six);
        seven =  findViewById(R.id.seven);
        eight =  findViewById(R.id.eight);
        nine =  findViewById(R.id.nine);
        zero =  findViewById(R.id.zero);
        dot =  findViewById(R.id.dot);
        plus =  findViewById(R.id.plus);
        minus =  findViewById(R.id.minus);
        into =  findViewById(R.id.into);
        div =  findViewById(R.id.div);
        equal =  findViewById(R.id.equal);
        c =  findViewById(R.id.c);
        out = findViewById(R.id.out);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+one.getText().toString());
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+two.getText().toString());
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+three.getText().toString());
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+four.getText().toString());
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+five.getText().toString());
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+six.getText().toString());
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+seven.getText().toString());
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+eight.getText().toString());
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+nine.getText().toString());
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText().toString()+zero.getText().toString());
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().contains(dot.getText().toString())) {
                    out.setText(out.getText().toString() + dot.getText().toString());
                }
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().isEmpty()||!num1.isEmpty()){
                    num1 = out.getText().toString();
                    action = "+";
                    out.setText("");
                }
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().isEmpty()||!num1.isEmpty()){
                    num1 = out.getText().toString();
                    action = "-";
                    out.setText("");
                }
            }
        });


        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().isEmpty()||!num1.isEmpty()){
                    num1 = out.getText().toString();
                    action = "*";
                    out.setText("");
                }
            }
       });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().isEmpty()||!num1.isEmpty()){
                    num1 = out.getText().toString();
                    action = "/";
                    out.setText("");
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!out.getText().toString().isEmpty()&& !action.isEmpty()){
                    num2 = out.getText().toString();
                    if(action.equals("+")){
                        ans = String.valueOf(Double.parseDouble(num1) +Double.parseDouble(num2));
                    }
                    else if(action.equals("-")){
                        ans = String.valueOf(Double.parseDouble(num1) -Double.parseDouble(num2));
                    }
                    else if(action.equals("*")){
                        ans = String.valueOf(Double.parseDouble(num1) *Double.parseDouble(num2));
                    }
                    else if(action.equals("/")){
                        ans = String.valueOf(Double.parseDouble(num1) /Double.parseDouble(num2));
                    }
                    out.setText(ans);
                    num1 = "";  num2 = "";  ans = "";   action = "";
                }
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = "";  num2 = "";  ans = "";   action = "";
                out.setText("");
            }
        });


    }


}
