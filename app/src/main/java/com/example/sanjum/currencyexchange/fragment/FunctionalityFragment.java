package com.example.sanjum.currencyexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.helper.Boby;

/**
 * Created by sanjum on 3/20/2018.
 */

public class FunctionalityFragment extends Fragment implements View.OnClickListener {
    private EditText editText;
    private TextView textView, tvStatus;
    private Button button;
    Boby boby;
    private int res;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            res = getArguments().getInt("INTKEY");
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
        updateStaus(res);
        return view;
    }


    @Override
    public void onClick(View v) {
        String[] demo = new String[0];
        int number = 0;
        if (res == 2) {
            String getValue = editText.getText().toString();
            demo = getValue.split(" ");
            Toast.makeText(getActivity(), "" + demo[0], Toast.LENGTH_SHORT).show();
        } else {
            number = Integer.parseInt(editText.getText().toString());
        }
        editText.setText("");
        textView.setVisibility(View.VISIBLE);
        switch (v.getId()) {
            case R.id.btn_frag_result:
                switch (res) {
                    case 0:
                        break;
                    case 1:
                        int result = boby.findFactorial(number);
                        textView.setText("" + result);
                        break;
                    case 2:
                        //int[] sortedArray = boby.bubbleSort(demo)
                        break;
                    case 3:
                        String palindrmeResult = boby.isPalindromeNumber(number);
                        textView.setText(palindrmeResult);
                        break;

                }

        }

    }

    private void updateStaus(int res) {
        switch (res) {
            case 0:
                tvStatus.setText("ArmStrong");
                break;
            case 1:
                tvStatus.setText("Factorial");
                break;
            case 2:
                tvStatus.setText("Fibbonacci");
                break;
            case 3:
                tvStatus.setText("Palindrome");
                break;
        }
    }
}
