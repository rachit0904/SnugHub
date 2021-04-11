package com.example.qrapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter2 extends FragmentPagerAdapter {
    private int noOfTabs;
    Context mContext;
    public PagerAdapter2(@NonNull FragmentManager fm, int tabs, Context context) {
        super(fm);
        this.noOfTabs=tabs;
        mContext=context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:{
                return "Display";
            } case 1:{
                return "Scan";
            } default:{
                return null;
            }
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:{
                return new dispqr();
            } case 1:{
                return new scanqr();
            }  default:{
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}