package com.paradas.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.paradas.Fragments.paraderos;
import com.paradas.Fragments.detalles;

public class FragmentAdapter extends FragmentPagerAdapter {

    Context context;

    public FragmentAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position){
        if(position == 0)
            return paraderos.getINSTANCE();
        else if (position == 1)
            return detalles.getINSTANCE();
        else
            return null;
    }

    @Override
    public int getCount() { return 2;}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Paraderos";

            case 1:
                return "Detalles";
        }

        return "";
    }
}
