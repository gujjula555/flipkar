package com.FlipkartAffiliates.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.FlipkartAffiliates.API.DataManager;
import com.FlipkartAffiliates.R;
import com.FlipkartAffiliates.databinding.ActivityMainBinding;
import com.FlipkartAffiliates.fragments.CategoryFragment;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ActivityMainBinding activityMainBinding;

    private MainViewModel createViewModel() {
        MainViewModelFactory factory = new MainViewModelFactory(DataManager.getInstance().getMovieService());
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainViewModel mainViewModel = createViewModel();


        activityMainBinding.slidingTabs.setupWithViewPager(activityMainBinding.viewpager);
        mainViewModel.getItemTypes().observe(this, new Observer<Map<String, JsonObject>>() {
            @Override
            public void onChanged(@Nullable Map<String, JsonObject> stringJsonObjectMap) {
                setupViewPager(stringJsonObjectMap);
            }
        });


    }


    private void setupViewPager(Map<String, JsonObject> myMap) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        Set<String> keys = myMap.keySet();
        Log.d(TAG, "setupViewPager: " + myMap.keySet());
        for (String key : keys) {

            String get = String.valueOf(myMap.get(key).getAsJsonObject("availableVariants").getAsJsonObject("v1.1.0").get("get"));

            System.out.println("Main - get - " + get);

            adapter.addFrag(new CategoryFragment().newInstance(get), key);

        }

        activityMainBinding.viewpager.setAdapter(adapter);
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}
