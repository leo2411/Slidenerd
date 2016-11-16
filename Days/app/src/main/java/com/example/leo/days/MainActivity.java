package com.example.leo.days;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView l;
    String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView temp = (TextView) view;
        Toast.makeText(this,temp.getText()+" "+i,Toast.LENGTH_SHORT).show();
    }
}
