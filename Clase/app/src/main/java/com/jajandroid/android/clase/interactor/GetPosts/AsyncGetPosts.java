package com.jajandroid.android.clase.interactor.GetPosts;

import android.os.AsyncTask;

import com.jajandroid.android.clase.model.Post;

import java.util.List;
import java.util.Vector;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class AsyncGetPosts extends AsyncTask<Void, Void, List<Post>>
{


    @Override
    protected List<Post> doInBackground(Void... params)
    {
        try {
            return getPosts();
        } catch (Exception e) {
            e.printStackTrace();
            return new Vector<>();
        }
    }

    private List<Post> getPosts() throws Exception
    {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://infinigag.k3min.eu")
                .addConverterFactory(GsonConverterFactory.create()).build();

        GetPostService      service      = retrofit.create(GetPostService.class);
        Call<PostsGson>     post         = service.getPost();
        Response<PostsGson> postResponse = post.execute();

        List<Post>     result = new Vector<>();
        List<PostGson> posts  = postResponse.body().data;
        for (PostGson aPost : posts) {
            Post iPost = new Post();
            iPost.setTitle(aPost.caption);
            iPost.setUrl(aPost.images.normal);
            result.add(iPost);
        }
        return result;
    }
}
