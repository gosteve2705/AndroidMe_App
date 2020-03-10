package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.android.android_me.R;

public class BodyPartFragment extends Fragment {

    //Mandatory constructor to initialise this fragment
    public  BodyPartFragment(){}
    //Inflates the fragment Layout fragment_body_part and sets any image resource
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false)

    }

}
