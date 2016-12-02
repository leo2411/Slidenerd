package com.example.leo.fragment_flex_ui_5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;

public class MainActivity extends Activity implements FragmentA.Communicator{

    FragmentA f1;
    FragmentB f2;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        f1 =(FragmentA) manager.findFragmentById(R.id.fragment);
        f1.setComm(this);
    }

    @Override
    public void respond(int index) {
        f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
        if(f2!=null && f2.isVisible())
        {
            f2.changeData(index);
        }
        else
        {
            Intent i = new Intent(this,Another.class);
            i.putExtra("index",index);
            startActivity(i);
        }
    }
}
