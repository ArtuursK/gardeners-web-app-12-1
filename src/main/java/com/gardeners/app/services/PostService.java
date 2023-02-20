package com.gardeners.app.services;


import com.gardeners.app.entities.Post;
import com.gardeners.app.mapper.GardenerPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Post> getAllPosts() {
        return jdbcTemplate.query(
                "select gardener.username, post.post_id, post.description, post.datetime " +
                        "from post, gardener " +
                        "where post.gardener_id = gardener.gardener_id;", new GardenerPostMapper());
    }
}
