package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addition extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    String getNum1,getNum2,result;
    Integer sum,num1,num2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);
        e1=(EditText)findViewById(R.id.number1);
        e2=(EditText)findViewById(R.id.number2);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.btl);
        t=(TextView)findViewById(R.id.result);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                t.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
    }
}