package com.aviral.netclan;

import static com.aviral.netclan.R.color.app_bar_color;
import static com.aviral.netclan.R.color.bottom_navigation_unselected;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aviral.netclan.Fragments.ExploreFragment;
import com.aviral.netclan.Fragments.RefineFragment;
import com.aviral.netclan.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RefineFragment refineFragment = new RefineFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, refineFragment);
        fragmentTransaction.commitAllowingStateLoss();

        LinearLayout btnRefine = findViewById(R.id.btn_refine);
        ImageView ivRefine = findViewById(R.id.iv_refine);
        TextView tvRefine = findViewById(R.id.tv_refine);

        LinearLayout btnExplore = findViewById(R.id.btn_explore);
        ImageView ivExplore = findViewById(R.id.iv_explore);
        TextView tvExplore = findViewById(R.id.tv_explore);

        ivRefine.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_refine_selected));
        tvRefine.setTextColor(getColor(app_bar_color));

        btnRefine.setOnClickListener(view -> {
            RefineFragment refineFragment1 = new RefineFragment();
            FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
            fragmentTransaction1.replace(R.id.container, refineFragment1);
            fragmentTransaction1.commitAllowingStateLoss();

            ivRefine.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_refine_selected));
            tvRefine.setTextColor(getColor(app_bar_color));

            ivExplore.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_explore_unselected));
            tvExplore.setTextColor(getColor(bottom_navigation_unselected));
        });

        btnExplore.setOnClickListener(view -> {
            ivRefine.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_refine_unselected));
            tvRefine.setTextColor(getColor(bottom_navigation_unselected));

            ExploreFragment exploreFragment = new ExploreFragment();
            FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
            fragmentTransaction2.replace(R.id.container, exploreFragment);
            fragmentTransaction2.commitAllowingStateLoss();

            ivExplore.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_explore_selected));
            tvExplore.setTextColor(getColor(app_bar_color));
        });


    }
}