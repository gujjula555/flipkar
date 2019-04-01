/*
package com.FlipkartAffiliates.activity;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

@SuppressWarnings("unused")
public class BindingAdapters {

    @BindingAdapter({"bind:imageUrl", "placeholder"})
    public static void loadImageWithPlaceHolder(ImageView imageView, String imageUrl, Drawable drawable) {
        Glide.with(imageView.getContext()).load(imageUrl).into(imageView);
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl)*/
/*.apply(RequestOptions.circleCropTransform())*//*
.into(view);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }


}
*/
