package com.rupali.androdev.assignment2_mt19095;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Shopping_list extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listitems;
     TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listitems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ListItem listItem = new ListItem(
                    "Item" + i + 1,
                    "1000"
            );
            listitems.add(listItem);
        }
        adapter = new MyAdapter(listitems, getContext());
        text = view.findViewById(R.id.textView2);

        recyclerView.setAdapter(adapter);
        return view;
    }
    public void set_data(){
        Bundle bundle=getArguments();
        String name = bundle.getString("NAME");
        text.setText(name);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


}
