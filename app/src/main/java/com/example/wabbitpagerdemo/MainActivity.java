package com.example.wabbitpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Button;

import com.eyepatch.wabbitpager_library.WabbitPager;
import com.eyepatch.wabbitpager_library.WabbitTabbedPager;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPagerWabbit;
    TabLayout tabLayout;
    Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerWabbit = findViewById(R.id.viewPagerWabbit);
        tabLayout = findViewById(R.id.tab_indicator);
        next = findViewById(R.id.btn_next);
        prev = findViewById(R.id.btn_prv);
        ArrayList<Fragment> fragList = new ArrayList<Fragment>(Arrays.asList(new Fragment1(), new Fragment2(), new Fragment3()));

//        WabbitTabbedPager wabbitTabbedPager = new WabbitTabbedPager(getSupportFragmentManager(), getLifecycle());
//        wabbitTabbedPager.addFragment(fragList);
//        wabbitTabbedPager.SummonTabbedPager(wabbitTabbedPager, viewPagerWabbit, tabLayout, next, prev, MainActivity.this, MainActivity2.class);
//        wabbitTabbedPager.setTabbedPagerScrollFashion(WabbitTabbedPager.TabbedPagerScrollFashion.VERTICAL);

        WabbitPager wabbitPager = new WabbitPager(getSupportFragmentManager(), getLifecycle());
        wabbitPager.addFragment(fragList);
        wabbitPager.SummonPager(wabbitPager, viewPagerWabbit, next, prev, MainActivity.this, MainActivity2.class);
        wabbitPager.setPagerScrollFashion(WabbitPager.PagerScrollFashion.HORIZONTAL);
    }
}