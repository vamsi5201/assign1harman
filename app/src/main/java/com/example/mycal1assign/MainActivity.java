package com.example.mycal1assign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private TextView textViewresult ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        textViewresult = (TextView) findViewById(R.id.textViewresult);




    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(editTextTextPersonName.getText().toString());
        int n2 = Integer.parseInt(editTextTextPersonName2.getText().toString());
        int sub = n1-n2;
        textViewresult.setText(String.valueOf(sub));

    }

    public void btnmulti(View view) {
        int n1 = Integer.parseInt(editTextTextPersonName.getText().toString());
        int n2 = Integer.parseInt(editTextTextPersonName2.getText().toString());
        int mul = n1*n2;
        textViewresult.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(editTextTextPersonName.getText().toString());
        int n2 = Integer.parseInt(editTextTextPersonName2.getText().toString());
        int div = n1/n2;
        textViewresult.setText(String.valueOf(div));
    }

    public void btnsum(View view) {
        int n1 = Integer.parseInt(editTextTextPersonName.getText().toString());
        int n2 = Integer.parseInt(editTextTextPersonName2.getText().toString());
        int sum = n1+n2;
        textViewresult.setText(String.valueOf(sum));
    }


    public void btnmod(View view) {
        int n1 = Integer.parseInt(editTextTextPersonName.getText().toString());
        int n2 = Integer.parseInt(editTextTextPersonName2.getText().toString());
        int mod1 = n1%n2;
        textViewresult.setText(String.valueOf(mod1));
    }
}