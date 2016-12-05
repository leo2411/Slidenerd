package com.example.leo.fragment_transaction_6;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
    }

    public void addA(View v)
    {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,f1,"A");
        transaction.commit();
    }
    public void addB(View v)
    {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,f2,"B");
        transaction.commit();
    }
    public void removeA(View v)
    {
        FragmentA f1 = (FragmentA)manager.findFragmentByTag("A");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f1!=null){
            transaction.remove(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this,"This fragment A was not added before",Toast.LENGTH_SHORT).show();
        }
    }
    public void removeB(View v)
    {
        FragmentB f1 = (FragmentB)manager.findFragmentByTag("B");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f1!=null){
            transaction.remove(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this,"This fragment B was not added before",Toast.LENGTH_SHORT).show();
        }
    }
    public void replaceAwB(View v)
    {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group,f2,"B");
        transaction.commit();
    }
    public void replaceBwA(View v)
    {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.group,f1,"A");
        transaction.commit();
    }
    public void attachA(View v)
    {
        FragmentA f1 = (FragmentA)manager.findFragmentByTag("A");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f1!=null){
            transaction.attach(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this,"This fragment A is not attached",Toast.LENGTH_SHORT).show();
        }

    }
    public void detachA(View v)
    {
        FragmentA f1 = (FragmentA)manager.findFragmentByTag("A");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f1!=null){
            transaction.detach(f1);
            transaction.commit();
        }
        else
        {
            Toast.makeText(this,"This fragment A is not deattached",Toast.LENGTH_SHORT).show();
        }
    }
}
