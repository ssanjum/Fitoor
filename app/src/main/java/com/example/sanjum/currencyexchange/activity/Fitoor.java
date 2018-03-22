package com.example.sanjum.currencyexchange.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sanjum.currencyexchange.R;

public class Fitoor extends AppCompatActivity implements View.OnClickListener {
    private Button btnfact, btnpalin, btnarm, btnfibbonacci;
    public static final int ARM = 0;
    public static final int FACT = 1;
    public static final int BUBBLE = 2;
    public static final int PALINDROME = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitoor);
        btnarm = findViewById(R.id.btnArmStrng);
        btnfact = findViewById(R.id.btnFactorial);
        btnfibbonacci = findViewById(R.id.btnBubbleSort);
        btnpalin = findViewById(R.id.btnPalindrome);
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
                Intent intent2 = new Intent(this, TabWithViewPagerActivity.class);
                intent2.putExtra("KEY", BUBBLE);
                startActivity(intent2);
                break;
            case R.id.btnPalindrome:
                Intent intent3 = new Intent(this, TabWithViewPagerActivity.class);
                intent3.putExtra("KEY", PALINDROME);
                startActivity(intent3);
                break;
        }
    }
}
