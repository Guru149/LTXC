package com.example.ltxc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class ltxc_home extends Fragment {
    ViewPager viewPager;
    Homefragmentadapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 View root=inflater.inflate(R.layout.fragment_ltxc_notification, container, false);
        adapter = new Homefragmentadapter(this.getActivity());
 return root;
    }
}