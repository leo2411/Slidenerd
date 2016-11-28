package com.example.leo.fragment_main_3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Leo on 28.11.2016..
 */

public class FragmentA extends Fragment implements View.OnClickListener{

    Button button;
    int conuter=0;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        conuter++;
        comm.respond("The button was clicked " +conuter+ " times");
    }
}
