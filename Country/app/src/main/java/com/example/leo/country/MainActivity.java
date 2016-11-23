package com.example.leo.country;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = (GridView) findViewById(R.id.gridView);
        grid.setAdapter(new LeoAdapter(this));
        grid.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, MyDialog.class);
        ViewHolder holder = (ViewHolder) view.getTag();
        Country temp = (Country) holder.myCountry.getTag();
        intent.putExtra("countryImage", temp.imageId);
        intent.putExtra("countryName", temp.countryName);
        startActivity(intent);
    }
}


class Country {
    int imageId;
    String countryName;

    Country(int imageId, String countryName) {
        this.imageId = imageId;
        this.countryName = countryName;
    }
}

class ViewHolder {
    ImageView myCountry;

    ViewHolder(View v) {
        myCountry = (ImageView) v.findViewById(R.id.imageView);
    }
}

class LeoAdapter extends BaseAdapter {
    Context context;
    ArrayList<Country> list;

    LeoAdapter(Context context) {
        list = new ArrayList<Country>();
        this.context = context;
        Resources res = context.getResources();
        String[] tempCountryNames = res.getStringArray(R.array.country_names);
        int[] countryImages = {R.drawable.german, R.drawable.italy, R.drawable.uk, R.drawable.spain, R.drawable.brazil, R.drawable.usa, R.drawable.croatia, R.drawable.safrica, R.drawable.china, R.drawable.argentina};

        for (int i = 0; i < 10; i++) {
            Country tempCountry = new Country(countryImages[i], tempCountryNames[i]);
            list.add(tempCountry);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_item, viewGroup, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Country temp = list.get(i);
        holder.myCountry.setImageResource(temp.imageId);
        holder.myCountry.setTag(temp);
        return row;
    }
}
