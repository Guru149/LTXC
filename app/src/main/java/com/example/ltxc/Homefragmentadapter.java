package com.example.ltxc;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;

import com.denzcoskun.imageslider.ImageSlider;

public class Homefragmentadapter extends PagerAdapter {
    public Homefragmentadapter(FragmentActivity activity) {


    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }


}
