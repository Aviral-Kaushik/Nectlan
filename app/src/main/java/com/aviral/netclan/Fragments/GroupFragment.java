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
import com.aviral.netclan.databinding.FragmentGroupBinding;

import java.util.ArrayList;


public class GroupFragment extends Fragment {

    private FragmentGroupBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentGroupBinding.inflate(inflater);

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

        recyclerModelArrayList.add(new RecyclerModel(
                "Anil Kumar Kaushik",
                "Khatauli, within 15 km",
                "Movies | Dinning",
                "Busy | Do Not Disturb | Will Catch Up Later"
        ));

        recyclerModelArrayList.add(new RecyclerModel(
                "Pallavi Kaushik",
                "Meerut, within 3 km",
                "Dating | Matrimony",
                "Away | Stay Discreet And Watch"
        ));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL, false);

        binding.groupRecyclerView.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter referralEarningAdapter =
                new RecyclerViewAdapter(recyclerModelArrayList);

        binding.groupRecyclerView.setAdapter(referralEarningAdapter);

    }
}