package com.example.sanjum.currencyexchange.activity;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.model.Result;
import com.example.sanjum.currencyexchange.network.ApiClient;
import com.example.sanjum.currencyexchange.network.ApiInterface;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        btnConvert = findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnConvert:
                getAllList();
                break;
        }
    }

    private void getAllList() {
        ApiInterface apiInterface = ApiClient.getCurrency().create(ApiInterface.class);
        Call<Result> call = apiInterface.getData();
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
               Gson gson=new Gson();
               Result result=gson.fromJson(String.valueOf(response.body()),Result.class);
               String name=result.name;
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        });

    }
}