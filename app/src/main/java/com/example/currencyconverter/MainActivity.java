package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v)
    {
        EditText currency = (EditText) findViewById(R.id.editTextTextPersonName);
        Log.i("info" , "button pressed to convert the currency");
        String a = currency.getText().toString();
        double b  = Double.parseDouble(a)/74;
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.inttousd);
        Toast.makeText(this,""+ a + " rupees is " + Double.toString(b) + "dollars", Toast.LENGTH_LONG).show();
    }
}