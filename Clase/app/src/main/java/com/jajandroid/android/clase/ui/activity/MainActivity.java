package com.jajandroid.android.clase.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.jajandroid.android.clase.R;
import com.jajandroid.android.clase.interactor.GetPosts;
import com.jajandroid.android.clase.model.Post;
import com.jajandroid.android.clase.ui.adapter.MainAdapter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity
{

    @Bind(R.id.main_recycler_view) RecyclerView mRecyclerView;
    @Bind(R.id.main_toolbar)       Toolbar      mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        loadData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void loadData()
    {
        List<Post>  dataSet = new GetPosts().getData();
        MainAdapter adapter = new MainAdapter(dataSet);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }

}
