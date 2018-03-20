package com.example.sanjum.currencyexchange.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.activity.adapter.PagerAdapter;
import com.example.sanjum.currencyexchange.fragment.CodeFragment;
import com.example.sanjum.currencyexchange.fragment.FunctionalityFragment;

public class TabWithViewPagerActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager pager;
    private Toolbar toolbar;
    private PagerAdapter adapter;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_with_view_pager);
        bundle = getIntent().getExtras();
        int res = bundle.getInt("PAL");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pager = findViewById(R.id.viewpager);
        setUpViewPager(pager);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
    }

    private void setUpViewPager(ViewPager pager) {

        adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FunctionalityFragment(), "Functionality");
        adapter.addFragment(new CodeFragment(), "Code");
        pager.setAdapter(adapter);
    }
}
