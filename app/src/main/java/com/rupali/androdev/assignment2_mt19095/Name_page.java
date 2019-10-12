package com.rupali.androdev.assignment2_mt19095;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Name_page extends Fragment {

    Button b;
    EditText edit;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View view= inflater.inflate(R.layout.fragment_name_page, container, false);
        final Shopping_list obj = new Shopping_list();
        b  = view.findViewById(R.id.btn);
        edit = view.findViewById(R.id.edit_text);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String result=edit.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("NAME",result);
                obj.setArguments(bundle);
            }
        });

        return view;

    }

}
