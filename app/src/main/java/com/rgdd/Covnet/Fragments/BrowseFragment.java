package com.rgdd.Covnet.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.rgdd.Covnet.MapsActivity;
import com.rgdd.Covnet.R;
import android.support.v4.app.Fragment;


public class BrowseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_browse, container, false);

        Button btn_browse = (Button) view.findViewById(R.id.btn_browse);
        btn_browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), MapsActivity.class);
                startActivity(in);

            }
        });
        return view;
    }
}





