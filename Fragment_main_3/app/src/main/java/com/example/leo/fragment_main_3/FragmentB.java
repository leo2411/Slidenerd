package com.example.leo.fragment_main_3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Leo on 28.11.2016..
 */

public class FragmentB extends Fragment{

    TextView text;
    String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        if(savedInstanceState==null) // fragment made for the first time
        {
        }
        else
        {
           data = savedInstanceState.getString("text");
            TextView myText = (TextView) view.findViewById(R.id.textView);
            myText.setText(data);
        }
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public  void changeText(String data)
    {
        this.data = data;
        text.setText(data);
    }
}
