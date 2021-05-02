package com.rgdd.Covnet.Fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rgdd.Covnet.ApplicationActivity;
import com.rgdd.Covnet.MapsActivity;
import com.rgdd.Covnet.R;
import com.rgdd.Covnet.RestrictionsActivity;
import com.rgdd.Covnet.SymptomsActivity;

import android.support.v4.app.Fragment;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton homeBlueBtn = (ImageButton) view.findViewById(R.id.homeBluebtn);
        homeBlueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ApplicationActivity.class);
                startActivity(in);

            }
        });

        ImageButton homeYellowBtn = (ImageButton) view.findViewById(R.id.homeYellowbtn);
        homeYellowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), SymptomsActivity.class);
                startActivity(in);

            }
        });

        ImageButton homeRedBtn = (ImageButton) view.findViewById(R.id.homeRedbtn);
        homeRedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), RestrictionsActivity.class);
                startActivity(in);

            }
        });

        return view;
    }
}
