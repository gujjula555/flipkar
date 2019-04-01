package com.FlipkartAffiliates.API;

import com.FlipkartAffiliates.util.WSConstants;
import com.google.gson.JsonObject;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

/**
 * Created by nndra on 13-Jan-18.
 */

public interface RestApi {
    @Headers({
            "Fk-Affiliate-Id:ramendu98",
            "Fk-Affiliate-Token:acbfa63280704742bdcb1c3d30de0b9e"
    })
    @GET("/affiliate/api/ramendu98.json")
    Call<JsonObject> GetProductList();
    //void GetProductList(Callback<JsonObject> callback);


    @Headers({
            WSConstants.AFFILIATE_ID +":"+WSConstants.AFFILIATE_ID_VALUE,
            WSConstants.AFFILIATE_TOKEN +":"+WSConstants.AFFILIATE_TOKEN_VALUE,
    })
    @GET
    Call<JsonObject> GetCategoryList(@Url String url);

}
