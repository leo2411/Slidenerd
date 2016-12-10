package com.example.leo.mx_demo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Leo on 10.12.2016..
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView list;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        list = (ListView)view.findViewById(R.id.listview);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.mx_riders,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

        return view;
    }

    public void setComm(Communicator comm){
        this.comm = comm;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comm.respond(i);
    }


    public interface Communicator{
        public void respond(int index);
    }
}
