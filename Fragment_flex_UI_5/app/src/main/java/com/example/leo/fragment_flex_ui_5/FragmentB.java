package com.example.leo.fragment_flex_ui_5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Leo on 2.12.2016..
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
        String[] descriptions  = getResources().getStringArray(R.array.description);
        text.setText(descriptions[index]);
    }
}
