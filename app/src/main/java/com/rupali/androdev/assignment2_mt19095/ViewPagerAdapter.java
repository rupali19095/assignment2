package com.rupali.androdev.assignment2_mt19095;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by dell on 10/12/2019.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    TextView  textView2;
    EditText  edit_text;


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Name_page();
            case 1:
                Shopping_list obj=new Shopping_list();
                obj.set_data();
                return obj;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
