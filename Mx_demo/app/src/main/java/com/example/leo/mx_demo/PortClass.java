package com.example.leo.mx_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Leo on 10.12.2016..
 */

public class PortClass extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.port_class);

        Intent i = getIntent();
        int index = i.getIntExtra("index",0);
        FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if(f2!=null){
            f2.changeData(index);
        }
    }
}
