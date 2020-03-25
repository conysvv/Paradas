package com.paradas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.paradas.Adapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id._viewPager);
        tabLayout = findViewById(R.id._tabLayout);


        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),this);
        viewPager.setAdapter(fragmentAdapter);

        tabLayout.setupWithViewPager(viewPager);



    }
}

