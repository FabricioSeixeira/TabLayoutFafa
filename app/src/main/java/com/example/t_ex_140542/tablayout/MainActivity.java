package com.example.t_ex_140542.tablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayoutId);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarId);
        viewPager = (ViewPager) findViewById(R.id.viewpagerId);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new Fragment_Quiz(), "Quiz");
        adapter.addFragment(new Fragment_Explore(), "Explore");
        adapter.addFragment(new Fragment_Store(), "Store");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
