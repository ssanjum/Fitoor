package com.example.sanjum.currencyexchange.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.sanjum.currencyexchange.R;

public class Fitoor extends AppCompatActivity implements View.OnClickListener {
    private Button btnfact, btnpalin, btnarm, btnfibbonacci, btnSelection;
    public static final String ARM = "arm";
    public static final String FACT = "fact";
    public static final String BUBBLE = "bubble";
    public static final String PALINDROME = "palindrom";
    public static final String SELECTION = "selection";
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitoor);
        btnarm = findViewById(R.id.btnArmStrng);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnfact = findViewById(R.id.btnFactorial);
        btnfibbonacci = findViewById(R.id.btnBubbleSort);
        btnpalin = findViewById(R.id.btnPalindrome);
        btnSelection = findViewById(R.id.btnSelection);
        btnSelection.setOnClickListener(this);
        btnpalin.setOnClickListener(this);
        btnarm.setOnClickListener(this);
        btnfibbonacci.setOnClickListener(this);
        btnfact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnArmStrng:
                Intent intent = new Intent(this, TabWithViewPagerActivity.class);
                intent.putExtra("KEY", ARM);
                startActivity(intent);
                break;
            case R.id.btnFactorial:
                Intent intent1 = new Intent(this, TabWithViewPagerActivity.class);
                intent1.putExtra("KEY", FACT);
                startActivity(intent1);
                break;
           case R.id.btnBubbleSort:
                Intent intent2 = new Intent(this, ArrayActivity.class);
                intent2.putExtra("KEY", BUBBLE);
                startActivity(intent2);
                break;
            case R.id.btnPalindrome:
                Intent intent3 = new Intent(this, TabWithViewPagerActivity.class);
                intent3.putExtra("KEY", PALINDROME);
                startActivity(intent3);
                break;
           case R.id.btnSelection:
                Intent intent4 = new Intent(this, ArrayActivity.class);
                intent4.putExtra("KEY", SELECTION);
                startActivity(intent4);
                break;
        }
    }
}
