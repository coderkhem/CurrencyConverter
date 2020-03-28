package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText amount=(EditText)findViewById(R.id.amount);



        String dollars=amount.getText().toString();
        int value=Integer.parseInt(dollars);
        int finalans=value/70;

        Toast.makeText(this,"Currency in dollars is:"+finalans,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
