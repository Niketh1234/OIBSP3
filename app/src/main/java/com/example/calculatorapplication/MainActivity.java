package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button ad,mul,sb,dv,per,c;
    TextView tv1;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad=(Button) findViewById(R.id.addition);
        mul=(Button) findViewById(R.id.multiplication);
        sb=(Button) findViewById(R.id.subtraction);
        dv=(Button) findViewById(R.id.division);
        per=(Button) findViewById(R.id.remainder);
        c=(Button) findViewById(R.id.clear);
        tv1=(TextView)findViewById(R.id.tv1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        ad.setOnClickListener(this);
        mul.setOnClickListener(this);
        c.setOnClickListener(this);
        dv.setOnClickListener(this);
        per.setOnClickListener(this);
        sb.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        float num1=0;
        float num2=0;
        float res=0;
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        if(TextUtils.isEmpty(s1)||TextUtils.isEmpty(s2))
        {
            return;
        }
        num1=Float.parseFloat(s1);
        et1.requestFocus();
        num2=Float.parseFloat(s2);
        et2.requestFocus();
        switch (v.getId())
        {
            case R.id.addition:
                res=num1+num2;
                break;
            case R.id.multiplication:
                res=num1*num2;
                break;
            case R.id.division:
                res=num1/num2;
                break;
            case R.id.subtraction:
                res=num1-num2;
                break;
            case R.id.remainder:
                res=num1%num2;
                break;
            case R.id.clear:
                tv1.setText("");
                et1.setText("");
                et2.setText("");
                break;
            default:
                break;

        }
        tv1.setText("Result : "+(int)res);
    }
}