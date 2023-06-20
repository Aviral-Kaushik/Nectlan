package com.aviral.netclan.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.aviral.netclan.Adapter.RecyclerViewAdapter;
import com.aviral.netclan.Models.RecyclerModel;
import com.aviral.netclan.databinding.FragmentBagBinding;

import java.util.ArrayList;

public class BagFragment extends Fragment {

    private FragmentBagBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBagBinding.inflate(inflater);

        View view = binding.getRoot();

        setupRecyclerView();

        // Inflate the layout for this fragment
        return view;
    }

    private void setupRecyclerView() {

        ArrayList<RecyclerModel> recyclerModelArrayList = new ArrayList<>();

        recyclerModelArrayList.add(new RecyclerModel(
                "Avichal Kaushik",
                "Meerut, within 5 km",
                "Business | Friendship",
                "Available | Hey Let Us Connect"
        ));

        recyclerModelArrayList.add(new RecyclerModel(
                "Aviral Kaushik",
                "Daurala, within 7 km",
                "Coffee | Hobbies",
                "SOS | Emergency! Need Assistance! HELP"
        ));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL, false);

        binding.bagRecyclerView.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter referralEarningAdapter =
                new RecyclerViewAdapter(recyclerModelArrayList);

        binding.bagRecyclerView.setAdapter(referralEarningAdapter);

    }
}