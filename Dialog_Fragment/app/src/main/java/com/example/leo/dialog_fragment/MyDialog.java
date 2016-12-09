package com.example.leo.dialog_fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Leo on 9.12.2016..
 */

public class MyDialog extends DialogFragment implements View.OnClickListener{

    Communicator comm;
    Button yes,no;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        comm=(Communicator) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_dialog,null);
        setCancelable(false);

        yes = (Button) view.findViewById(R.id.no);
        yes.setOnClickListener(this);
        no = (Button) view.findViewById(R.id.yes);
        no.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.no){

            comm.onDialogMessage("no was clicked");
            dismiss();

        }
        else {

            comm.onDialogMessage("yes was clicked");
            dismiss();

        }
    }

    interface Communicator
    {
        public void onDialogMessage(String message);
    }


}
