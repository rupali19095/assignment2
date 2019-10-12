package com.rupali.androdev.assignment2_mt19095;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dell on 10/12/2019.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Name_page(); //ChildFragment1 at position 0
            case 1:
                return new Shopping_list(); //ChildFragment2 at position 1
                    }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 2; //three fragments
    }
}
