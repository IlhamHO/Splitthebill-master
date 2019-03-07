package be.ehb.splitthebill.utilities;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import be.ehb.splitthebill.fragment.EersteFragment;
import be.ehb.splitthebill.fragment.TweedeFragment;

public class TabAdapter extends FragmentPagerAdapter {


    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0: return "SPLIT IT";
            case 1: return "ABOUT";
        }
        return "hackerman";
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                return EersteFragment.newInstance();

            case 1:
                return TweedeFragment.newInstance();
        }

            return null;
        }
        @Override
        public int getCount () {
            return 2;
        }

    }