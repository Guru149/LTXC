package com.example.ltxc;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ltxc_course extends Fragment {


    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View root =inflater.inflate(R.layout.fragment_ltxc_course, container, false);
        CardView cardView = root.findViewById(R.id.about_us_card);
        return root;
       /* cardView.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View v) {
               // View inflate = inflater.inflate(getContext(), ltxc_login.class);
                return false;
            }
        });*/
    }
}