package com.example.hw33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {

private ContactAdapter adapter;
private ArrayList<String> list;
private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContact();
        adapter = new ContactAdapter();
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
    }

    private void loadContact() {
        list=new ArrayList<>();
        list.add("070921512");
        list.add("070921513");
        list.add("070921514");
        list.add("070921515");
        list.add("070921516");
        list.add("070921517");
        list.add("070921518");
        list.add("070921519");
        list.add("070921510");
    }

}