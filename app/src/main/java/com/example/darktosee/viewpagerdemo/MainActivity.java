package com.example.darktosee.viewpagerdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private TabLayout.Tab tab;
    private List<String> titles ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }
    public void initviews(){

        titles = new ArrayList<>();
for(int i =1;i<=10;i++) {
    titles.add("第"+i+"个"+"tab"+i);

}


        mTablayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),this,titles));
       mTablayout.setTabTextColors(Color.GRAY,Color.RED);
        mTablayout.setupWithViewPager(mViewPager);


        for(int i =0;i<10;i++) {
            tab = mTablayout.getTabAt(i);
        }

    }
}
