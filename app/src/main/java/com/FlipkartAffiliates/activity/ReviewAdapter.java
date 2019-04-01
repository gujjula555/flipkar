package com.FlipkartAffiliates.activity;

import android.content.Context;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.FlipkartAffiliates.R;

import com.FlipkartAffiliates.fragments.ProductInfo;
import com.FlipkartAffiliates.response.ItemModel;
import com.bumptech.glide.Glide;


import java.util.List;

public class ReviewAdapter extends
        RecyclerView.Adapter<ReviewAdapter.ViewHolder> {
    private static final String TAG = "ReviewAdapter";
    private List<ProductInfo> productInfos;
    private Context context;

    public ReviewAdapter(Context ctx) {

        context = ctx;
    }
    public void setListData(List<ProductInfo> listData){
        this.productInfos = listData;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photo_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ProductInfo photo = productInfos.get(position);
        Log.d(TAG, "onBindViewHolder: " + photo);
        holder.textView.setText(photo.getTitle());
        Glide.with(context).load(photo.getImage200x200()).into( holder.imageView);


    }

    @Override
    public int getItemCount() {
        return productInfos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView imageView;
       TextView  textView;

        public ViewHolder(View v) {
            super(v);
           imageView = v.findViewById(R.id.photo);
           textView = v.findViewById(R.id.title);
        }
    }

}
