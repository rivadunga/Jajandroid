package com.jajandroid.android.clase.interactor;

import com.jajandroid.android.clase.model.Post;

import java.util.List;
import java.util.Vector;


public class GetPosts
{
    public List<Post> getData()
    {

        List<Post> posts = new Vector<>();
        Post       post1 = new Post();
        post1.setTitle("Hola a todos");
        post1.setUrl("http://icdn4.digitaltrends.com/image/android-tethering-1024x768.png");
        Post post2 = new Post();
        post2.setTitle("Jajatl");
        post2.setUrl(
                "https://informabtlcdnzone-grupodecomunicac.netdna-ssl.com/wp-content/uploads/2014/12/Captura-de-pantalla-2014-12-11-a-las-14.05.01.png");
        posts.add(post1);
        posts.add(post2);
        return posts;
    }
}
