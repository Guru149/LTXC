package com.example.ltxc;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totaltabs;

    public LoginAdapter(@NonNull FragmentManager fm , Context context, int totaltabs) {
        super(fm);
        this.context=context;
        this.totaltabs=totaltabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                login_fragment loginFragment=new login_fragment();
                return loginFragment;
            case 1:
                ltxc_Signup ltxc_signup=new ltxc_Signup();
                return ltxc_signup;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totaltabs;
    }
}
