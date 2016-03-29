package com.jajandroid.android.clase.interactor.GetPosts;

import retrofit.Call;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;


public interface GetPostService
{
    @GET("hot")
    Call<PostsGson> getPost();
}

