package com.example.sanjum.currencyexchange.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.helper.Boby;

public class ArrayActivity extends AppCompatActivity {
    private Button btngetSortedArray;
    private Toolbar toolbar;
    String res;
    private Bundle bundle;
    private EditText edGetValue;
    private Boby boby;
    private TextView tvArrayResult, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvArrayResult = findViewById(R.id.tv_array_result);
        edGetValue = findViewById(R.id.ed_array);
        tvDescription = findViewById(R.id.tv_arr_description);
        bundle = getIntent().getExtras();
        boby = new Boby();
        res = bundle.getString("KEY");
        updateStaus(res);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btngetSortedArray = findViewById(R.id.btn_array_find);
        btngetSortedArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] demo = new String[0];
                int[] arr = new int[0];
                String getValue = edGetValue.getText().toString();
                demo = getValue.split(",");
                arr = new int[demo.length];
                for (int i = 0; i < demo.length; i++) {
                    arr[i] = Integer.parseInt(demo[i]);
                }
                edGetValue.setText("");
                switch (res) {
                    case Fitoor.BUBBLE:
                        arr = boby.bubbleSort(arr);
                        for (int i = 0; i < arr.length; i++) {
                            tvArrayResult.append("" + arr[i]);
                        }
                        break;
                    case Fitoor.SELECTION:
                        arr = boby.selectionSort(arr);
                        tvArrayResult.setText("Sorted Array is:");
                        for (int i = 0; i < arr.length; i++) {
                            tvArrayResult.append("" + arr[i]);
                        }
                        break;

                }
            }
        });
    }

    private void updateStaus(String res) {
        switch (res) {
            case Fitoor.BUBBLE:
                tvDescription.setText("Bubble Sort");
                break;
            case Fitoor.SELECTION:
                tvDescription.setText("Selection Sort");
                break;
        }
    }
}
