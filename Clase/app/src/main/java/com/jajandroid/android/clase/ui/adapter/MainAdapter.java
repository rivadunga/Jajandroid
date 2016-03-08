package com.jajandroid.android.clase.ui.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jajandroid.android.clase.R;
import com.jajandroid.android.clase.model.Post;
import com.jajandroid.android.clase.ui.holder.MainHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainHolder>
{

    private List<Post> mDataSet;

    public MainAdapter(List<Post> dataSet)
    {
        mDataSet = dataSet;
    }

    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                               .inflate(R.layout.layout_post, parent, false);
        return new MainHolder(v);
    }

    @Override
    public void onBindViewHolder(MainHolder holder, int position)
    {

        holder.title.setText(mDataSet.get(position).getTitle());
        holder.image.setImageBitmap(null);
        Picasso.with(holder.image.getContext()).cancelRequest(holder.image);
        Picasso.with(holder.image.getContext())
               .load(mDataSet.get(position).getUrl())
               .into(holder.image);
    }

    @Override
    public int getItemCount()
    {
        return mDataSet.size();
    }
}
