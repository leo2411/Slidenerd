package com.example.leo.mx_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Leo on 10.12.2016..
 */

public class FragmentB extends Fragment {

    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        text = (TextView) view.findViewById(R.id.textView);

        return view;
    }

    public void changeData(int index)
    {
        String[] description = getResources().getStringArray(R.array.description);
        text.setText(description[index]);
    }
}
