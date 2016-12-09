package com.example.darktosee.viewpagerdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HJUser on 2016/12/09.
 */
class MyFragmentPagerAdapter extends FragmentPagerAdapter {

     private List<String> titles ;



    private Context context;



    public MyFragmentPagerAdapter(FragmentManager fm, Context context,List<String> titles) {
        super(fm);
        this.context = context;
        this.titles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        return MyFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {

        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);

    }
}