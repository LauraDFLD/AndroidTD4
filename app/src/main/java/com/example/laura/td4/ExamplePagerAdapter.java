package com.example.laura.td4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by laura on 30/09/2016.
 */

public class ExamplePagerAdapter extends FragmentStatePagerAdapter {

    public ExamplePagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment =  null;

        switch (position)
        {
            case 0:
                fragment = new TextFragment();
                break;
            case 1:
                fragment = new NumberPickerFragment();
                break;
            default:
                fragment = new TextFragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount()
    {
        //le nombre d’onglet
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return "myFrag";
    }
}