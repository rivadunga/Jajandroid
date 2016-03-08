package com.jajandroid.android.clase.ui.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jajandroid.android.clase.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainHolder extends RecyclerView.ViewHolder
{

    public @Bind(R.id.post_image) ImageView image;
    public @Bind(R.id.post_title) TextView  title;

    public MainHolder(View view)
    {
        super(view);
        ButterKnife.bind(this, view);
    }
}
