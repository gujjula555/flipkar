package com.FlipkartAffiliates.fragments;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.FlipkartAffiliates.API.FlipkartService;
import com.FlipkartAffiliates.activity.MainViewModel;
import com.FlipkartAffiliates.response.ItemModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryViewModel extends ViewModel {

    private MutableLiveData<List<ProductInfo>> itemTypes;
    private MutableLiveData<Boolean> isLoading;

    private FlipkartService flipkartService;

    CategoryViewModel(FlipkartService flipkartService,String s) {
        if(this.flipkartService == null) {
            this.flipkartService = flipkartService;
            itemTypes = new MutableLiveData<>();
            isLoading = new MutableLiveData<>();

        }else{

        }
    }


    MutableLiveData<List<ProductInfo>> getItemTypes() {
        return itemTypes;
    }

    MutableLiveData<Boolean> getLoadingStatus() {
        return isLoading;
    }

   public void loadFlipkartNetwork(String s) {
        setIsLoading(true);

        Call<JsonObject> movieCall = flipkartService.getFlipkartFeeds().GetCategoryList(s);
        movieCall.enqueue(new MovieCallback());
    }

    //void showEmptyList() { setItemTypes(Collections.<Movie>emptyList()); }

    private void setIsLoading(boolean loading) {
        isLoading.postValue(loading);
    }

    private void setItemTypes(List<ProductInfo> productInfos) {
        setIsLoading(false);
        itemTypes.postValue(productInfos);
    }

    /**
     * Callback
     **/
    private class MovieCallback implements Callback<JsonObject> {

        @Override
        public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {
            if (response.isSuccessful()) {


                try {
                    JSONObject jsonObject = new JSONObject(response.body().toString());
                    List<ProductInfo> productInfos = new ArrayList<>();
                    JSONArray productArray = jsonObject.getJSONArray("products");


                   // JSONArray productArray = obj.getJSONArray("productInfoList");

                    for(int i =0; i < productArray.length(); i++) {

                        ProductInfo pinfo = new ProductInfo();
                        JSONObject inner_obj = productArray.getJSONObject(i).getJSONObject("productBaseInfo");
                        pinfo.setId(inner_obj.getJSONObject("productIdentifier").getString("productId"));

                        JSONObject attributes = inner_obj.getJSONObject("productAttributes");
                        pinfo.setTitle(attributes.getString("title"));
                        pinfo.setDescription(attributes.optString("productDescription", ""));
                        pinfo.setMaximumRetailPrice(attributes.getJSONObject("maximumRetailPrice").getDouble("amount"));
                        pinfo.setSellingPrice(attributes.getJSONObject("sellingPrice").getDouble("amount"));
                        pinfo.setDiscountPercentage(attributes.getDouble("discountPercentage"));
                        pinfo.setProductUrl(attributes.getString("productUrl"));
                        pinfo.setInStock(attributes.getBoolean("inStock"));
                        pinfo.setProductBrand(attributes.getString("productBrand"));
                        pinfo.setImage200x200(attributes.getJSONObject("imageUrls").getString("200x200"));
                        pinfo.setImage400x400(attributes.getJSONObject("imageUrls").getString("400x400"));

                        productInfos.add(pinfo);
                    }


                    setItemTypes(productInfos);
                    // Fetch the products from the next URL. Here we set the limit to 500 products.
                   String queryUrl = jsonObject.optString("nextUrl", "");
                    if(queryUrl != null && !queryUrl.isEmpty() && productInfos.size() > 1000) { queryUrl = ""; }












/*

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
                        productInfos.add(itemModel);

                    }
*/


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }


        @Override
        public void onFailure(Call<JsonObject> call, Throwable t) {
            // setItemTypes(Collections.<Movie>emptyList());

        }
    }



}
