package com.google.ar.core.examples.java.cloudanchor;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
