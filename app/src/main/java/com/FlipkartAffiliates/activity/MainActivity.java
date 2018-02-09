package com.FlipkartAffiliates.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.FlipkartAffiliates.API.ApiUtil;
import com.FlipkartAffiliates.fragments.CategoryFragment;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.flipkartAffiliate.R;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity  {

    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);


        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        //viewPager.setCurrentItem(1);

            callFirstAPI();

    }

    private void callFirstAPI() {

        ApiUtil.GetRestApiWithoutHeader().GetProductList().enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {

                System.out.println("Main - map - "+response.toString());

                if (response.isSuccessful()) {

                    JsonObject jsonObject = response.body();

                    String filtered = ""+jsonObject.get("apiGroups").getAsJsonObject().get("affiliate").getAsJsonObject().get("apiListings");

                    Type type = new TypeToken<Map<String, JsonObject>>(){}.getType();
                    Gson gson = new Gson();
                    Map<String, JsonObject> myMap = gson.fromJson(filtered, type);

                    setupViewPager(myMap);
                } else {
                    try {
                        System.out.println("Main - is - "+response.errorBody().string());
                    } catch (Exception e) {
                    }
                }

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                System.out.println("Main - jsonObject error - "+t.toString());
            }
        });

    }

    private void setupViewPager(Map<String, JsonObject> myMap) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        Set<String> keys = myMap.keySet();

        for(String key: keys){

            String get = ""+myMap.get(key).getAsJsonObject("availableVariants").getAsJsonObject("v0.1.0").get("get");

            System.out.println("Main - get - "+get);

            adapter.addFrag(new CategoryFragment().newInstance(get),key);

        }

        viewPager.setAdapter(adapter);
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList< >();
        private final List< String > mFragmentTitleList = new ArrayList < >();

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
