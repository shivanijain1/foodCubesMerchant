package com.example.foodcubesmerchant;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new fragment_breakfast();
                break;
            case 1:
                fragment = new fragment_lunch();
                break;
            case 2:
                fragment = new fragment_dinner();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
