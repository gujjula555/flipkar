package com.FlipkartAffiliates.activity;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.FlipkartAffiliates.API.FlipkartService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Map<String, JsonObject>> itemTypes;
    private MutableLiveData<Boolean> isLoading;

    private FlipkartService flipkartService;

    MainViewModel(FlipkartService flipkartService) {
        if(this.flipkartService == null) {
            this.flipkartService = flipkartService;
            itemTypes = new MutableLiveData<>();
            isLoading = new MutableLiveData<>();
            loadFlipkartNetwork();
        }else{

        }
    }

    MutableLiveData<Map<String, JsonObject>> getItemTypes() {
        return itemTypes;
    }

    MutableLiveData<Boolean> getLoadingStatus() {
        return isLoading;
    }

    void loadFlipkartNetwork() {
        setIsLoading(true);

        Call<JsonObject> movieCall = flipkartService.getFlipkartFeeds().GetProductList();
        movieCall.enqueue(new MovieCallback());
    }

    //void showEmptyList() { setItemTypes(Collections.<Movie>emptyList()); }

    private void setIsLoading(boolean loading) {
        isLoading.postValue(loading);
    }

    private void setItemTypes(Map<String, JsonObject> itemtypes) {
        setIsLoading(false);
        itemTypes.postValue(itemtypes);
    }

    /**
     * Callback
     **/
    private class MovieCallback implements Callback<JsonObject> {

        @Override
        public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {
            if (response.isSuccessful()) {

                JsonObject jsonObject = response.body();

                String filtered = "" + jsonObject.get("apiGroups").getAsJsonObject().get("affiliate").getAsJsonObject().get("apiListings");

                Type type = new TypeToken<Map<String, JsonObject>>() {
                }.getType();
                Gson gson = new Gson();
                Map<String, JsonObject> myMap = gson.fromJson(filtered, type);

                setItemTypes(myMap);
            } else {
                try {
                    System.out.println("Main - is - " + response.errorBody().string());
                } catch (Exception e) {
                }
            }
        }


        @Override
        public void onFailure(Call<JsonObject> call, Throwable t) {
            // setItemTypes(Collections.<Movie>emptyList());

        }
    }

}
