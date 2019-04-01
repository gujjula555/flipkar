package com.FlipkartAffiliates.activity;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.FlipkartAffiliates.API.FlipkartService;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private final FlipkartService flipkartApi;

    public MainViewModelFactory(FlipkartService flipkartApi) {
        this.flipkartApi = flipkartApi;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(flipkartApi);
        }

        throw new IllegalArgumentException("Unknown ViewModel class");
    }

}
