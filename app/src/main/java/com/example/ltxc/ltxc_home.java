package com.example.ltxc;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class ltxc_home extends Fragment {
    SliderView sliderView;
    List<ImageSliderModel> imageSliderModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 ViewGroup root=(ViewGroup) inflater.inflate(R.layout.fragment_ltxc_home, container, false);
        CardView cardView = root.findViewById(R.id.about_us_card);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ltxc_login.class);
                startActivity(intent);
            }
        });

        imageSliderModelList =new ArrayList<>();
        sliderView=root.findViewById(R.id.imageSlider);
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img1));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img4));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img2));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img5));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img7));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.img6));

        sliderView.setSliderAdapter(new ImageSliderAdapter(this,imageSliderModelList));
 return root;
    }
}