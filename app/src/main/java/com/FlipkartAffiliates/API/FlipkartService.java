package com.FlipkartAffiliates.API;

import com.FlipkartAffiliates.util.WSConstants;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

public class FlipkartService {



    private FlipkartApi mFlipkartApi;

    private static FlipkartService instance;


    public static FlipkartService getInstance() {
        if (instance == null) {
            instance = new FlipkartService();
        }
        return instance;
    }

    private FlipkartService() {
        Retrofit mRetrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(WSConstants.BASE_URL).build();
        mFlipkartApi = mRetrofit.create(FlipkartApi.class);
    }

    public FlipkartApi getFlipkartFeeds() {
        return mFlipkartApi;
    }

    public interface FlipkartApi {

        @Headers({
                WSConstants.AFFILIATE_ID +":"+WSConstants.AFFILIATE_ID_VALUE,
                WSConstants.AFFILIATE_TOKEN +":"+WSConstants.AFFILIATE_TOKEN_VALUE,
        })
        @GET("/affiliate/api/ramendu98.json")
        Call<JsonObject> GetProductList();

        @Headers({
                WSConstants.AFFILIATE_ID +":"+WSConstants.AFFILIATE_ID_VALUE,
                WSConstants.AFFILIATE_TOKEN +":"+WSConstants.AFFILIATE_TOKEN_VALUE,
        })
        @GET
        Call<JsonObject> GetCategoryList(@Url String url);

    }

}
