package com.FlipkartAffiliates.API;

import com.google.gson.JsonObject;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

/**
 * Created by nndra on 13-Jan-18.
 */

public interface RestApi {

    @GET("/affiliate/api/affliatek.json")
    Call<JsonObject> GetProductList();
    //void GetProductList(Callback<JsonObject> callback);


    @Headers({
            "Fk-Affiliate-Id:affliatek",
            "Fk-Affiliate-Token:98ccd7d7aa0c4b59a3f831d1db50f24e"
    })
    @GET
    Call<JsonObject> GetCategoryList(@Url String url);

}
