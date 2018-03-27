package com.example.sanjum.currencyexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sanjum.currencyexchange.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sanjum on 3/20/2018.
 */

public class CodeFragment extends Fragment {
    private TextView textView;
    private InputStream inputStream;
    private String res;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            res = getArguments().getString("INTKEY");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_code, null);
        textView = view.findViewById(R.id.tv_frag_code);
        String value = "";
        try {
            switch (res) {
                case "arm":
                    inputStream = getActivity().getAssets().open("armstrong.txt");
                    break;
                case "fact":
                    inputStream = getActivity().getAssets().open("factorial.txt");
                    break;
                case "palindrom":
                    inputStream = getActivity().getAssets().open("palindrom.txt");
                    break;

            }

            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            value = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        textView.setText(value);
        return view;
    }
}
