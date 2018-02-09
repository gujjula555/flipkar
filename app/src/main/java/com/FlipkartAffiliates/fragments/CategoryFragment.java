package com.FlipkartAffiliates.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.FlipkartAffiliates.API.ApiUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.flipkartAffiliate.R;
import com.squareup.picasso.Picasso;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    private static String mUrl;
    private ImageView img;
    private TextView productName, productDescription;


    public static CategoryFragment newInstance(String url) {

        mUrl =url;
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rView = inflater.inflate(R.layout.fragment_category, container, false);
        img = (ImageView) rView.findViewById(R.id.img_category);
        productName = (TextView) rView.findViewById(R.id.txt_product_name);
        productDescription = (TextView) rView.findViewById(R.id.txt_product_description);

        makeApiCall();


        return rView;
    }

    private void makeApiCall() {

        String NewUrl = mUrl.substring(36);
        NewUrl = NewUrl.substring(0, NewUrl.length() - 1);

        ApiUtil.GetRestApiWithoutHeader2().GetCategoryList(NewUrl).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.isSuccessful()) {

                    JsonObject jsonObject = response.body();

                    JsonElement filtered = jsonObject.get("productInfoList").getAsJsonArray().get(0).getAsJsonObject()
                            .get("productBaseInfo").getAsJsonObject().get("productAttributes").getAsJsonObject();

                    System.out.println("Category - filtered - " + filtered);

                    System.out.println("Category - title - " + filtered.getAsJsonObject().get("title").toString());

                    productName.setText(""+filtered.getAsJsonObject().get("title"));
                    productDescription.setText(""+filtered.getAsJsonObject().get("productDescription"));

                    String imageUrl = filtered.getAsJsonObject().get("imageUrls").getAsJsonObject().get("unknown").toString();
                    String NewUrl = imageUrl.substring(1, imageUrl.length() - 1);
                    System.out.println("Category - img - " + NewUrl);

                    Picasso.with(getActivity())
                            .load(NewUrl)
                            .into(img);

                    /*for(int i=0; i<filtered.length();i++){
                        String baseInfo = ""+jsonObject.get("productInfoList").getAsJsonArray().get(i).getAsJsonObject();
                    }*/



                }else{
                    System.out.println("Category - jsonObject - " + response.toString());
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                System.out.println("Category - error - " + t.toString());
            }
        });

    }

}
