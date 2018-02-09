package com.FlipkartAffiliates.API;



import com.FlipkartAffiliates.util.WSConstants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by nndra on 13-Jan-18.
 */

public class ApiUtil {


    public static RestApi GetRestApiWithoutHeader() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WSConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RestApi service = retrofit.create(RestApi.class);

        return service;
    }

    public static RestApi GetRestApiWithoutHeader2() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WSConstants.BASE_URL_SECOND_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RestApi service = retrofit.create(RestApi.class);

        return service;
    }

   /* public static RestApi GetRestApiWithHeader(final String url) {

        final OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setReadTimeout(60, TimeUnit.SECONDS);
        okHttpClient.setConnectTimeout(60, TimeUnit.SECONDS);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                         request.addPathParam("url", url);
                         request.addHeader(WSConstants.AFFILIATE_ID,    WSConstants.AFFILIATE_ID_VALUE);
                         request.addHeader(WSConstants.AFFILIATE_TOKEN, WSConstants.AFFILIATE_TOKEN_VALUE);
                    }
                })
                .setClient(new OkClient(okHttpClient))
                .setLogLevel(RestAdapter.LogLevel.FULL).setLog(new AndroidLog("API_UTIL"))
                .setEndpoint(WSConstants.BASE_URL_SECOND_API)
                .build();

        return restAdapter.create(RestApi.class);
    }*/



}
