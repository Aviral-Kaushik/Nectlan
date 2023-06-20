package com.aviral.netclan.Fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;

import com.aviral.netclan.R;
import com.aviral.netclan.databinding.FragmentRefineBinding;

public class RefineFragment extends Fragment {

    private FragmentRefineBinding binding;

    private boolean coffee = false,
            business = false,
            hobbies = false,
            friendship = false,
            movies = false,
            dinning = false,
            dating = false,
            matrimony = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentRefineBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(),
                android.R.layout.simple_spinner_item,
                new String[]{
                        "Available | Hey Let Us Connect",
                        "Away | Stay Discreet And Watch",
                        "Busy | Do Not Disturb | Will Catch Up Later",
                        "SOS | Emergency! Need Assistance! HELP"
                });

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.availabilitySpinner.setAdapter(adapter);

        binding.statusEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = binding.statusEditText.getText().toString();
                int count = text.length();
                binding.wordCount.setText(String.format("%d/250", count));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.coffee.setOnClickListener(view1 -> {
            if (!coffee) {
                binding.coffee.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                coffee = true;

                binding.coffee.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.coffee.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.coffee.setTextColor(requireContext().getColor(R.color.black));

                coffee = false;
            }
        });

        binding.business.setOnClickListener(view1 -> {
            if (!business) {
                binding.business.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                business = true;

                binding.business.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.business.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.business.setTextColor(requireContext().getColor(R.color.black));

                business = false;
            }
        });

        binding.hobbies.setOnClickListener(view1 -> {
            if (!hobbies) {
                binding.hobbies.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                hobbies = true;

                binding.hobbies.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.hobbies.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.hobbies.setTextColor(requireContext().getColor(R.color.black));

                hobbies = false;
            }
        });

        binding.friendship.setOnClickListener(view1 -> {
            if (!friendship) {
                binding.friendship.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                friendship = true;

                binding.friendship.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.friendship.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.friendship.setTextColor(requireContext().getColor(R.color.black));

                friendship = false;
            }
        });

        binding.movies.setOnClickListener(view1 -> {
            if (!movies) {
                binding.movies.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                movies = true;

                binding.movies.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.movies.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.movies.setTextColor(requireContext().getColor(R.color.black));

                movies = false;
            }
        });

        binding.dinning.setOnClickListener(view1 -> {
            if (!dinning) {
                binding.dinning.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                dinning = true;

                binding.dinning.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.dinning.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.dinning.setTextColor(requireContext().getColor(R.color.black));

                dinning = false;
            }
        });

        binding.dating.setOnClickListener(view1 -> {
            if (!coffee) {
                binding.dating.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                dating = true;

                binding.dating.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.dating.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.dating.setTextColor(requireContext().getColor(R.color.black));

                dating = false;
            }
        });

        binding.matrimony.setOnClickListener(view1 -> {
            if (!matrimony) {
                binding.matrimony.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_selected_background));
                matrimony = true;

                binding.matrimony.setTextColor(requireContext().getColor(R.color.white));
            } else {
                binding.matrimony.setBackground(AppCompatResources.getDrawable(requireContext(),
                        R.drawable.text_unselected_background));

                binding.matrimony.setTextColor(requireContext().getColor(R.color.black));

                matrimony = false;
            }
        });

        return view;
    }
}
