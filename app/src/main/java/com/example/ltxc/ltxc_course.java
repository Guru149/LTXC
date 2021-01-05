package com.example.ltxc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ltxc_course extends Fragment {

    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

       ViewGroup root =(ViewGroup) inflater.inflate(R.layout.fragment_ltxc_course, container, false);
        CardView cardView = root.findViewById(R.id.about_us_card);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ltxc_login.class);
                startActivity(intent);
            }
        });
        return root;
    }
}