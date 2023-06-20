package com.aviral.netclan.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;

import com.aviral.netclan.Adapter.ViewPagerAdapter;
import com.aviral.netclan.R;
import com.aviral.netclan.databinding.FragmentExploreBinding;

import java.util.Objects;

public class ExploreFragment extends Fragment {

    private FragmentExploreBinding binding;

    private boolean clicked = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExploreBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        setUpViewPager();

        binding.fabAdd.setOnClickListener(view1 -> floatingActionButtonPressed());

        return view;
    }

    private void floatingActionButtonPressed() {
        setVisibility(clicked);
        setAnimation(clicked);
        setClickable(clicked);

        binding.coordinate.setBackground(AppCompatResources.getDrawable(requireContext(), R.drawable.blur_background));

        clicked = !clicked;
    }


    private void setVisibility(boolean clicked) {
        if (!clicked) {
            binding.fabNotes.setVisibility(View.VISIBLE);
            binding.tvNotes.setVisibility(View.VISIBLE);
            binding.fabJobs.setVisibility(View.VISIBLE);
            binding.tvJobs.setVisibility(View.VISIBLE);
            binding.fabBuy.setVisibility(View.VISIBLE);
            binding.tvBuy.setVisibility(View.VISIBLE);
            binding.fabCard.setVisibility(View.VISIBLE);
            binding.tvCard.setVisibility(View.VISIBLE);
        } else {
            binding.fabNotes.setVisibility(View.INVISIBLE);
            binding.tvNotes.setVisibility(View.INVISIBLE);
            binding.fabJobs.setVisibility(View.INVISIBLE);
            binding.tvJobs.setVisibility(View.INVISIBLE);
            binding.fabBuy.setVisibility(View.INVISIBLE);
            binding.tvBuy.setVisibility(View.INVISIBLE);
            binding.fabCard.setVisibility(View.INVISIBLE);
            binding.tvCard.setVisibility(View.INVISIBLE);
        }
    }

    private void setAnimation(boolean clicked) {

        Animation rotateOpen = AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_close_anim);
        Animation rotateClose = AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_close_anim);


        if (!clicked) {
            binding.fabAdd.startAnimation(rotateOpen);
        } else {
            binding.fabAdd.startAnimation(rotateClose);
        }
    }

    private void setClickable(boolean clicked) {
        if (!clicked) {
            binding.fabNotes.setClickable(true);
            binding.tvNotes.setClickable(true);
            binding.fabBuy.setClickable(true);
            binding.tvBuy.setClickable(true);
            binding.fabCard.setClickable(true);
            binding.tvCard.setClickable(true);
            binding.fabJobs.setClickable(true);
            binding.tvJobs.setClickable(true);
        } else {
            binding.fabNotes.setClickable(false);
            binding.tvNotes.setClickable(false);
            binding.fabBuy.setClickable(false);
            binding.tvBuy.setClickable(false);
            binding.fabCard.setClickable(false);
            binding.tvCard.setClickable(false);
            binding.fabJobs.setClickable(false);
            binding.tvJobs.setClickable(false);
        }
    }

    private void setUpViewPager() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getParentFragmentManager());
        adapter.addFragment(new GroupFragment(), "");
        adapter.addFragment(new BagFragment(), "");
        adapter.addFragment(new ShopFragment(), "");

        binding.viewpagerContainer.setAdapter(adapter);
        binding.tabs.setupWithViewPager(binding.viewpagerContainer);

        Objects.requireNonNull(binding.tabs.getTabAt(0)).setIcon(R.drawable.ic_group);
        Objects.requireNonNull(binding.tabs.getTabAt(1)).setIcon(R.drawable.ic_bag);
        Objects.requireNonNull(binding.tabs.getTabAt(2)).setIcon(R.drawable.ic_shope);

//        SectionPagerAdapter adapter = new SectionPagerAdapter(getParentFragmentManager());
//        adapter.addFragment(new GroupFragment());
//        adapter.addFragment(new BagFragment());
//        adapter.addFragment(new ShopFragment());
//
//        ViewPager viewPager = getActivity().findViewById(R.id.viewpager_container);
//        viewPager.setAdapter(adapter);
//
//        TabLayout tabLayout = requireActivity().findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//
//        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.ic_group);
//        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.ic_bag);
//        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.ic_shope);
    }
}
