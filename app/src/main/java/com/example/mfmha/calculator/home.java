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
    TextView out,out1;
    boolean isDotAvailable;
    static boolean gotResult=false;

    public static String fixDecimal(String value){
        try{
            gotResult =true;
            String[] output = value.split("\\.");
            if(Long.parseLong(output[1]) == 0){
                return output[0];
            }
            if(output[1].length()>1){
                return output[0] + "." + output[1].substring(0, 2);
            }
            else {
                return output[0] + "." + output[1].substring(0, 1);
            }
        }
        catch (NumberFormatException e){
            return value;
        }



    }

    public static String eval(String exp){
        String plus="\\+",minus="-",into="\u00D7",div="\u00F7",n1,n2,ans;

        if(!exp.isEmpty()){
            if(exp.split(plus).length == 2){
                    n1 = exp.split(plus)[0];
                    n2 = exp.split(plus)[1];
                    ans = String.valueOf(Double.parseDouble(n1) +Double.parseDouble(n2));
            }

            else if(exp.split(minus).length == 2 && exp.charAt(0)!= '-'){
                n1 = exp.split(minus)[0];
                n2 = exp.split(minus)[1];
                ans = String.valueOf(Double.parseDouble(n1) - Double.parseDouble(n2));
            }
            else if(exp.charAt(0)== '-' && exp.split(minus).length == 3){
                n1 = "-"+exp.split(minus)[1];
                n2 = exp.split(minus)[2];
                ans = String.valueOf(Double.parseDouble(n1) - Double.parseDouble(n2));
            }

            else if(exp.split(into).length == 2){
                n1 = exp.split(into)[0];
                n2 = exp.split(into)[1];
                ans = String.valueOf(Double.parseDouble(n1) * Double.parseDouble(n2));
            }

            else if(exp.split(div).length == 2){
                n1 = exp.split(div)[0];
                n2 = exp.split(div)[1];
                if(Double.parseDouble(n1)==0.0){
                    return "0.00";
                }
                ans = String.valueOf(Double.parseDouble(n1) / Double.parseDouble(n2));

            }
            else if(exp.contains("+")||exp.contains(minus)||exp.contains(into)||exp.contains(div)){
                if(exp.charAt(0)=='-'&&exp.charAt(exp.length())!='-') {
                    return exp;
                }

                return exp.substring(0,exp.length()-1);
            }
            else{

                return exp;
            }
        }
        else{

            return exp;
        }

        return home.fixDecimal(ans);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
        out1 = findViewById(R.id.out1);
        gotResult=false;
        isDotAvailable = true;

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
                String temp = out.getText().toString();
                if(temp.isEmpty()){
                    temp = "0";
                }
                if(isDotAvailable) {
                    out.setText(temp + dot.getText().toString());
                    isDotAvailable = false;
                }
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDotAvailable = true;
                String temp = home.eval(out.getText().toString());
                if(!temp.isEmpty()&&!temp.equals("-")) {
                    if(!gotResult){
                        out.setText((temp+"+"));
                    }
                    else{
                        out1.setText(temp);
                        out.setText((temp+"+"));
                        gotResult = false;
                    }
                }
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDotAvailable = true;
                String temp = home.eval(out.getText().toString());
                if(temp.isEmpty()||!temp.equals("-")) {
                    if(!gotResult){
                        out.setText((temp+"-"));
                    }
                    else{
                        out1.setText(temp);
                        out.setText((temp+"-"));
                        gotResult=false;
                    }
                }
            }
        });


        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDotAvailable = true;
                String temp = home.eval(out.getText().toString());
                if(!temp.isEmpty()&&!temp.equals("-")) {
                    if(!gotResult){
                        out.setText((temp+"\u00D7"));
                    }
                    else{
                        out1.setText(temp);
                        out.setText((temp+"\u00D7"));
                        gotResult=false;
                    }

                }
            }
       });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDotAvailable = true;
                String temp = home.eval(out.getText().toString());
                if(!temp.isEmpty()&&!temp.equals("-")) {
                    if(!gotResult){
                        out.setText((temp+"\u00F7"));
                    }
                    else{
                        out1.setText(temp);
                        out.setText((temp+"\u00F7"));
                        gotResult=false;
                    }
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out1.setText(home.eval(out.getText().toString()));

            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDotAvailable = true;
                out.setText("");
                out1.setText("");
                isDotAvailable=true;
                gotResult=false;
            }
        });


    }


}
