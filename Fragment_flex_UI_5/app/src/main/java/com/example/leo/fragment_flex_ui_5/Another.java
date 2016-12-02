package com.example.leo.fragment_flex_ui_5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Leo on 2.12.2016..
 */

public class Another extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another);

        Intent i = getIntent();
        int index = i.getIntExtra("index",0);
        FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if(f2!=null){
            f2.changeData(index);
        }

    }
}
