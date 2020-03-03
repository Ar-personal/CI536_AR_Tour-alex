package com.google.ar.core.examples.java.cloudanchor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class TutorialActivity extends AppCompatActivity{

    private FragmentPagerAdapter fragmentPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        tabLayout = findViewById(R.id.tabDots);

        viewPager = findViewById(R.id.viewPager);
        setPagerAdapter();
    }


    private void setPagerAdapter(){
        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
