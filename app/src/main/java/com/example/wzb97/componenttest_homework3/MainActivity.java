package com.example.wzb97.componenttest_homework3;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button first,second,x;
    TextView text ;
    CheckBox a1,a2;
    RadioButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }
    private void setListener(){
        first=(Button)findViewById(R.id.button);
        second=(Button)findViewById(R.id.button2);
        x=(Button)findViewById(R.id.button8);
        text=(TextView)findViewById(R.id.textView2) ;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
        a1=(CheckBox)findViewById(R.id.checkBox);
        a2=(CheckBox)findViewById(R.id.checkBox2);
        b1=(RadioButton) findViewById(R.id.radioButton);
        b2=(RadioButton)findViewById(R.id.radioButton2);
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        x.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.equals(first)){
            text.setText(text.getText()+"?");
        }
        else if(view.equals(second)){
            text.setText("Hello?");
        }
        else if(view.equals(a1)){
            text.setText("1");
        }
        else if(view.equals(a2)){
            text.setText("2");
        }
        else if(view.equals(b1)){
            text.setText("3");
        }
        else if(view.equals(b2)){
            text.setText("4");
        }
        else if(view.equals(x)){
            finish();
        }

    }
}
