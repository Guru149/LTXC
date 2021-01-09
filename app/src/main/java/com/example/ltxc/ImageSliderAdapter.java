package com.example.ltxc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;

import com.denzcoskun.imageslider.ImageSlider;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class ImageSliderAdapter extends SliderViewAdapter<SliderViewHolder> {
    ltxc_home context;
    List<ImageSliderModel> imageSliderModelList;

    public ImageSliderAdapter(ltxc_home context, List<ImageSliderModel> imageSliderModelList) {
        this.context = context;
        this.imageSliderModelList = imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_layout,parent,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
        viewHolder.slider.setImageResource(imageSliderModelList.get(position).getImage());

    }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }
}
class SliderViewHolder extends SliderViewAdapter.ViewHolder{
    ImageView slider;
    public SliderViewHolder(View itemView) {

        super(itemView);
        slider=itemView.findViewById(R.id.imgview);

    }
}

