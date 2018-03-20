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

import com.example.sanjum.currencyexchange.R;
import com.example.sanjum.currencyexchange.helper.Boby;

/**
 * Created by sanjum on 3/20/2018.
 */

public class FunctionalityFragment extends Fragment implements View.OnClickListener {
    private EditText editText;
    private TextView textView;
    private Button button;
    Boby boby;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_functionality, null);
        editText = view.findViewById(R.id.ed_frag_getNumber);
        button = view.findViewById(R.id.btn_frag_IsPalindrom);
        textView = view.findViewById(R.id.tv_frag_result);
        button.setOnClickListener(this);
        boby = new Boby();
        return view;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_frag_IsPalindrom) {
            textView.setVisibility(View.VISIBLE);
            int number = Integer.parseInt(editText.getText().toString());
            boolean isPalindrom = boby.isPalindromeNumber(number);
            editText.setText("");
            if (isPalindrom) {
                textView.setText("Given Number " + number + " is Palindrom");
            } else {
                textView.setText(number + " Not  Palindrom");
            }
        }
    }
}
