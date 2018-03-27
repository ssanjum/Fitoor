package com.example.sanjum.currencyexchange.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

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
    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_with_view_pager);
        bundle = getIntent().getExtras();
        res = bundle.getString("KEY");
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        pager = findViewById(R.id.viewpager);
        setUpViewPager(pager, res);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
    }

    private void setUpViewPager(ViewPager pager, String value) {
        Bundle bundle = new Bundle();
        bundle.putString("INTKEY", value);
        FunctionalityFragment functionalityFragment = new FunctionalityFragment();
        CodeFragment codeFragment = new CodeFragment();
        functionalityFragment.setArguments(bundle);
        codeFragment.setArguments(bundle);
        adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(functionalityFragment, "Functionality");
        adapter.addFragment(codeFragment, "Code");
        pager.setAdapter(adapter);
    }
}
