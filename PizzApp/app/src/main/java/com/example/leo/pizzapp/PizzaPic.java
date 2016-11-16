package com.example.leo.pizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PizzaPic extends AppCompatActivity implements View.OnClickListener {

    ImageView c1, c2, c3, c4, c5, c6, c7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_pic);

        c1 = (ImageView) findViewById(R.id.ImageView1);
        c2 = (ImageView) findViewById(R.id.ImageView2);
        c3 = (ImageView) findViewById(R.id.ImageView3);
        c4 = (ImageView) findViewById(R.id.ImageView4);
        c5 = (ImageView) findViewById(R.id.ImageView5);
        c6 = (ImageView) findViewById(R.id.ImageView6);
        c7 = (ImageView) findViewById(R.id.ImageView7);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);


        Toast.makeText(this,"CheckBox pizza types",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ImageView1) {
            c1.setVisibility(View.GONE);
            c2.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView2) {
            c2.setVisibility(View.GONE);
            c3.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView3) {
            c3.setVisibility(View.GONE);
            c4.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView4) {
            c4.setVisibility(View.GONE);
            c5.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView5) {
            c5.setVisibility(View.GONE);
            c6.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView6) {
            c6.setVisibility(View.GONE);
            c7.setVisibility(View.VISIBLE);
        }
        else if (v.getId() == R.id.ImageView7) {
            c7.setVisibility(View.GONE);
            c1.setVisibility(View.VISIBLE);
        }
    }
}
