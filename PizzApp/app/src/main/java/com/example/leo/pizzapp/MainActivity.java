package com.example.leo.pizzapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView n ;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = (TextView)findViewById(R.id.naslov);
        Typeface customfont = Typeface.createFromAsset(getAssets(),"fonts/customfont.ttf");
        n.setTypeface(customfont);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,PizzaPic.class);
        startActivity(i);
    }
}

