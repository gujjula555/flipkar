package com.FlipkartAffiliates.fragments;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.FlipkartAffiliates.API.DataManager;
import com.FlipkartAffiliates.R;
import com.FlipkartAffiliates.activity.MainViewModelFactory;
import com.FlipkartAffiliates.activity.ReviewAdapter;
import com.FlipkartAffiliates.databinding.FragmentCategoryBinding;
import com.FlipkartAffiliates.util.GridSpacingItemDecoration;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

   // private static String mUrl;

    ReviewAdapter reviewAdapter;
    FragmentCategoryBinding categoryBinding;
    public static CategoryFragment newInstance(String url) {

       // mUrl = url;
        CategoryFragment fragment = new CategoryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url",url);
        fragment.setArguments(bundle);
        return fragment;
    }

    public CategoryFragment() {
        // Required empty public constructor
    }
    private CategoryViewModel createViewModel() {
        MainViewModelFactory factory = new MainViewModelFactory(DataManager.getInstance().getMovieService());
        return ViewModelProviders.of(this, factory).get(CategoryViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        categoryBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_category,container,false);
       // View v  = inflater.inflate(R.layout.fragment_category,container,false);

        //makeApiCall();


        return categoryBinding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String NewUrl = getArguments().getString("url").substring(36);
        NewUrl = NewUrl.substring(0, NewUrl.length() - 1);

        CategoryViewModel categoryViewModel= createViewModel();
        categoryViewModel.loadFlipkartNetwork(NewUrl);

        boolean includeEdge = true;
        categoryBinding.photoList.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        int spanCount = 2; // 3 columns
        int spacing = 20; // 50px
        categoryBinding.photoList.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));
        reviewAdapter = new ReviewAdapter(getActivity());

        //binding.photoList.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        categoryBinding.photoList.setAdapter(reviewAdapter);
        categoryViewModel.getItemTypes().observe(this, new Observer<List<ProductInfo>>() {
            @Override
            public void onChanged(@Nullable List<ProductInfo> productInfos) {
                reviewAdapter.setListData(productInfos);
                categoryBinding.progressCircular.setVisibility(View.GONE);
                categoryBinding.photoList.setVisibility(View.VISIBLE);
                reviewAdapter.notifyDataSetChanged();
            }
        });



    }


    /*private void makeApiCall() {

        String NewUrl = getArguments().getString("url").substring(36);
        NewUrl = NewUrl.substring(0, NewUrl.length() - 1);

        ApiUtil.GetRestApiWithoutHeader2().GetCategoryList(NewUrl).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()) {


                    try {
                        JSONObject jsonObject = new JSONObject(response.body().toString());
                        itemModels.clear();
                        JSONArray jsonArray = jsonObject.getJSONArray("products");
                        for (int i = 0; i < jsonArray.length(); i++) {
                           ItemModel itemModel = new ItemModel();
                            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                            JSONObject jsonObject2 = jsonObject1.getJSONObject("productBaseInfoV1");
                            String productId = jsonObject2.getString("productId");
                            itemModel.setProductId(productId);
                            String title = jsonObject2.getString("title");
                             itemModel.setTitle(title);
                            String image = jsonObject2.getJSONObject("imageUrls").getString("200x200");
                           itemModel.setImage(image);
                            itemModels.add(itemModel);

                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    progressCircular.setVisibility(View.GONE);
                    photoList.setVisibility(View.VISIBLE);
                    reviewAdapter.notifyDataSetChanged();
                   // photos.addAll(response.body());


                   *//* JsonObject jsonObject = response.body();


                    JsonElement filtered = jsonObject.getAsJsonArray("products");


                    System.out.println("Category - filtered - " + ((JsonArray) filtered).getAsJsonObject("productBaseInfoV1"));

                    System.out.println("Category - title - " + filtered.getAsJsonObject().get("title").toString());

                    productName.setText("" + filtered.getAsJsonObject().get("title"));
                    productDescription.setText("" + filtered.getAsJsonObject().get("productDescription"));

                    String imageUrl = filtered.getAsJsonObject().get("imageUrls").getAsJsonObject().get("unknown").toString();
                    String NewUrl = imageUrl.substring(1, imageUrl.length() - 1);
                    System.out.println("Category - img - " + NewUrl);
*//*
                  *//* if(itemModels.size()>0) {
                       Picasso.with(getActivity())
                               .load(itemModels.get(0).getImage())
                               .into(img);
                       productName.setText("" + itemModels.get(0).getTitle());
                       productDescription.setText("" + itemModels.get(0).getProductId());
                   }*//*


                    *//*for(int i=0; i<filtered.length();i++){
                        String baseInfo = ""+jsonObject.get("productInfoList").getAsJsonArray().get(i).getAsJsonObject();
                    }*//*


                } else {
                    System.out.println("Category - jsonObject - " + response.toString());
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                System.out.println("Category - error - " + t.toString());
            }
        });

    }*/

}
