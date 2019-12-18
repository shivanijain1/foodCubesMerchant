package com.example.foodcubesmerchant;

import android.os.Bundle;

import androidx.annotation.Nullable;
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
       /* switch (position) {
            case 0:
                fragment = new fragment_breakfast();
                Bundle bundle = new Bundle();
                bundle.putString("message", "breakfast");
                fragment.setArguments(bundle);
                break;

            case 1:
                fragment = new fragment_lunch();
                Bundle bundle1 = new Bundle();
                bundle1.putString("message", "breakfast");
                fragment.setArguments(bundle1);
                break;

            case 2:
                fragment = new fragment_dinner();
                Bundle bundle2 = new Bundle();
                bundle2.putString("message", "breakfast");
                fragment.setArguments(bundle2);

                break;
        }
        return fragment;
    }*/

    @Override
    public int getCount() {
        return 3;
    }


   /* public CharSequence getPageTitle(int position) {
        return "fragment "+position+1;
    }*/
}
