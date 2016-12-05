package com.example.leo.fragment_transaction_6;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentA extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("Leo","Fragment a onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_a, container, false);
        Log.d("Leo","Fragment a onCreateView");
        return view;
    }

    @Override
    public void onAttach(Context context) {
        Log.d("Leo","Fragment a onAttach");
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Leo","Fragment a onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Leo","Fragment a onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Leo","Fragment a onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Leo","Fragment a onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Leo","Fragment a onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Leo","Fragment a onDetach");
    }
}
