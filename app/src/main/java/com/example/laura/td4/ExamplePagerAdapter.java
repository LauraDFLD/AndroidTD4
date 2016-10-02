package com.example.laura.td4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by laura on 30/09/2016.
 */

public class ExamplePagerAdapter extends FragmentStatePagerAdapter {

    public ExamplePagerAdapter(FragmentManager fm) // constructeur
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment =  null;

        switch (position) // change de classe en fonction de l'onglet
        {
            case 0:
                fragment = new TextFragment(); // onglet texte
                break;
            case 1:
                fragment = new NumberPickerFragment(); // onglet numberpicker
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
        // compte le nombre d’onglet
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return "myFrag";
    }
}