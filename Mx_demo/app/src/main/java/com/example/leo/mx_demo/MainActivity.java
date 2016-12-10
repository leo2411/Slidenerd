package com.example.leo.mx_demo;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity implements FragmentA.Communicator {

    FragmentA f1;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        f1 = (FragmentA)manager.findFragmentById(R.id.fragment);
        f1.setComm(this);
    }

    @Override
    public void respond(int index) {
        Intent i = new Intent(this,PortClass.class);
        i.putExtra("index",index);
        startActivity(i);
    }
}
