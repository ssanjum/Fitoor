package com.example.sanjum.currencyexchange.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.helper.Boby;

/**
 * Created by sanjum on 3/20/2018.
 */

public class FunctionalityFragment extends Fragment implements View.OnClickListener {
    private EditText editText;
    private TextView textView, tvStatus;
    private Button button;
    private Boby boby;
    private String resultCode;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            resultCode = getArguments().getString("INTKEY");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_functionality, null);
        editText = view.findViewById(R.id.ed_frag_getNumber);
        button = view.findViewById(R.id.btn_frag_result);
        textView = view.findViewById(R.id.tv_frag_result);
        tvStatus = view.findViewById(R.id.tv_frag_status);
        button.setOnClickListener(this);
        boby = new Boby();
        updateStaus(resultCode);
        return view;
    }


    @Override
    public void onClick(View v) {
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        String result;
        int number = 0;
        editText.setText("");
        textView.setVisibility(View.VISIBLE);
        // String[] demo = new String[0];
        // int[] arr = new int[0];
       /* if (resultCode == 2 || resultCode == 4) {
            String getValue = editText.getText().toString();
            demo = getValue.split(",");
            arr = new int[demo.length];
            for (int i = 0; i < demo.length; i++) {
                arr[i] = Integer.parseInt(demo[i]);
            }
        } else {
            if (TextUtils.isEmpty(editText.getText().toString())) {
                editText.setError("Please Enter Integer");
            } else {
                number = Integer.parseInt(editText.getText().toString());
            }

        }*/
        switch (v.getId()) {
            case R.id.btn_frag_result:
                switch (resultCode) {
                    case "arm":
                        result = boby.isArmStrong(number);
                        textView.setText(result);
                        break;
                    case "fact":
                        result = String.valueOf(boby.findFactorial(number));
                        textView.setText("" + result);
                        break;
                    case "palindrom":
                        result = boby.isPalindromeNumber(number);
                        textView.setText(result);
                        break;
                }

        }

    }

    private void updateStaus(String res) {
        switch (res) {
            case "arm":
                tvStatus.setText("ArmStrong");
                break;
            case "fact":
                tvStatus.setText("Factorial");
                break;
            case "palindrom":

        }
    }
}
