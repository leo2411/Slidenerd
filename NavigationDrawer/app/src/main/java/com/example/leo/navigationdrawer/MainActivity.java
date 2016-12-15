package com.example.leo.navigationdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    DrawerLayout drawerLayout;
    ListView listView;
    String[] planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        planets = getResources().getStringArray(R.array.planets);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        listView = (ListView) findViewById(R.id.drawerList);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,planets));
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,planets[i]+" was selected",Toast.LENGTH_SHORT).show();
        selectItem(i);
    }

    public void selectItem(int i){
        listView.setItemChecked(i,true);
        setTitle(planets[i]);
    }

    public void setTitle(String title){
        getSupportActionBar().setTitle(title);
    }
}
